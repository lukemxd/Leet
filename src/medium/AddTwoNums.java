package medium;

public class AddTwoNums {
	
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode dummyHead = new ListNode(0);
    	ListNode current = dummyHead;
    	int carry = 0;
    	while(l1 != null || l2 != null){
    		int value = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
    		if(l1 != null) l1 = l1.next;
    		if(l2 != null) l2 = l2.next;
    		carry = value > 9 ? 1 : 0;
    		current.next = new ListNode(value % 10);
    		current = current.next;
    	}
    	if(carry == 1) current.next = new ListNode(1);
    	return dummyHead.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		//l1.next = new ListNode(4);
		//l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(8);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		
		ListNode result = addTwoNumbers(l1, l2);
		while(result != null){
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

}
