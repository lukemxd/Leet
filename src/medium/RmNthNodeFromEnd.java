package medium;

public class RmNthNodeFromEnd {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode fast = head, slow = head;
    	while(fast != null && n-- > 0) fast = fast.next;
    	if(fast == null && n != 0) return head;
    	if(fast == null && n == 0) return head.next;
    	while(fast != null && fast.next != null){
    		fast = fast.next;
    		slow = slow.next;
    	}
    	slow.next = slow.next.next;
    	return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
