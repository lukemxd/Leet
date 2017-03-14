package medium;

public class OddEvenLinkedList {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    public ListNode oddEvenList(ListNode head) {
    	if(head == null)
    		return null;
    	ListNode oddIter = head;
    	ListNode evenIter = head.next;
    	ListNode evenHead = evenIter;

    	while(evenIter != null && evenIter.next != null){
    		oddIter.next = oddIter.next.next;
    		evenIter.next = evenIter.next.next;
    		oddIter = oddIter.next;
    		evenIter = evenIter.next;
    	}
    	oddIter.next = evenHead;
    	return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
