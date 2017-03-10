package easy;

public class LinkedListIntersection {
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if(headA == headB)
    		return headA;
    	int lengthA = 0, lengthB = 0;
    	ListNode currA = headA, currB = headB;
    	while(currA != null){
    		currA = currA.next;
    		lengthA++;
    	}
    	currA = headA;
    	while(currB != null){
    		currB = currB.next;
    		lengthB++;
    	}
    	currB = headB;
    	int diff = Math.abs(lengthA - lengthB);
    	if(lengthA >= lengthB){
    		while(diff-- > 0) currA = currA.next;
    	}else{
    		while(diff-- > 0) currB = currB.next;	
    	}
    	while(currA != null){
    		if(currA == currB)
    			return currA;
    		currA = currA.next;
    		currB = currB.next;
    	}
    	return null;
    }
    
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
    	if(headA == null || headB == null) return null;
    	ListNode currA = headA, currB = headB;
    	while(currA != currB){
    		currA = (currA == null) ? headB : currA.next;
    		currB = (currB == null) ? headA : currB.next;
    	}
    	return currA;
    }
}
