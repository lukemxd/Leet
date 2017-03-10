package easy;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
	
	/*private static class minWithCount{
		int value;
		int count;
		public minWithCount(int val, int cout) {
			this.value =val;
			this.count = cout;
		}
	}*/
	
	private static class valueWithMin{
		int value;
		int min;
		public valueWithMin(int val, int min) {
			this.value =val;
			this.min = min;
		}	
	}
	
	private Deque<valueWithMin> minStack;
	//private Deque<minWithCount> minValue;
	
    public MinStack() {
    	this.minStack = new LinkedList<>(); 
    	//this.minValue = new LinkedList<>();
    }
    
    public void push(int x) {
    	if(minStack.isEmpty()) minStack.addFirst(new valueWithMin(x, x));
    	else{
    		minStack.addFirst(new valueWithMin(x, Math.min(x, minStack.peekFirst().min)));
    	}
    	/*minStack.addFirst(x);
    	if(!minValue.isEmpty()){
    		minWithCount currentMin = minValue.peekFirst();
    		if(x < currentMin.value) minValue.addFirst(new minWithCount(x, 1));
    		else if(x == currentMin.value) currentMin.count++;  
    	}else minValue.addFirst(new minWithCount(x, 1));*/
    }
    
    public int pop() {
    	if(!minStack.isEmpty()){
    		return minStack.removeFirst().value;
    	}
    	/*if(!minStack.isEmpty()){
    		Integer top = minStack.peekFirst();
    		minWithCount currentMin = minValue.peekFirst();
    		if(top == currentMin.value){
    			currentMin.count--;
    			if(currentMin.count == 0) minValue.removeFirst();
    		}
    		minStack.removeFirst();	
    	}*/
    	return -1;
    }
    
    public int top() {
    	if(!minStack.isEmpty()) return minStack.peekFirst().value;
    	else return -1;
    }
    
    public int getMin() {
    	if(!minStack.isEmpty()){
    		//return minValue.peekFirst().value;
    		return minStack.peekFirst().min;
    	}
    	else return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
