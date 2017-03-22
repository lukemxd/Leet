package medium;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomLinkedList {

	class RandomListNode {
	    int label;
	    RandomListNode next, random;
	    RandomListNode(int x) { this.label = x; }
	}
	
    public RandomListNode copyRandomList(RandomListNode head) {
    	if(head != null) return null;
    	
    	Map<RandomListNode, RandomListNode> table = new HashMap<>();
    	RandomListNode current = head;
    	while(current != null){
    		table.put(current, new RandomListNode(current.label));
    		current = current.next;
    	}
    	current = head;
    	while (current != null) {
    		table.get(current).next = table.get(current.next);
    		table.get(current).random = table.get(current.random);
    		current = current.next;
    	}
    	
    	return table.get(head);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
