package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK {
	
	public static class NumberWithCount{
		private Integer number;
		private int count;
		public NumberWithCount(int num, int cont){
			this.number = num;
			this.count = cont;
		}
	}

    public static List<Integer> topKFrequent(int[] nums, int k) {
    	if(k == 0)
    		return null;
    	List<Integer> result = new ArrayList<>();
    	Map<Integer, Integer> table = new HashMap<>();
    	//T(n) = n * log(k)
    	PriorityQueue<NumberWithCount> minHeap = new PriorityQueue<>(k, new Comparator<NumberWithCount>() {
    		@Override
    		public int compare(NumberWithCount m1, NumberWithCount m2){
    			return Integer.compare(m1.count, m2.count);
    		}
    	});
    	
    	for(int i = 0; i < nums.length; ++i){
    		table.put(nums[i], 
    				table.containsKey(nums[i]) ? table.get(nums[i]) + 1 : 1);
    	}
    	for(Map.Entry<Integer, Integer> entry : table.entrySet()){
    		NumberWithCount curr = new NumberWithCount(entry.getKey(), entry.getValue());
    		if(minHeap.size() >= k){
    			NumberWithCount top = minHeap.peek();
    			if(curr.count > top.count){
    				minHeap.poll();
    				minHeap.add(curr);
    			}
    		}else minHeap.add(curr);
    	}
    	Iterator<NumberWithCount> iter = minHeap.iterator();
    	while(iter.hasNext())
    		result.add(iter.next().number);
    	Collections.reverse(result);
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1, 1, 1, 2, 2, 3};
		List<Integer> result = topKFrequent(nums, 3);
		for(Integer in : result)
			System.out.print(in + " ");
	}

}
