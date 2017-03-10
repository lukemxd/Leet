package easy;

public class LinkedListPalindromicity {

	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	private ListNode Reverse(ListNode L){
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = L;
		ListNode sublistNode = dummyHead.next;
		ListNode temp = sublistNode.next;
		while(sublistNode.next != null){
			temp = sublistNode.next;
			sublistNode.next = temp.next;
			temp.next = dummyHead.next;
			dummyHead.next = temp;
		}
		return dummyHead.next;	
	}
	
    public boolean isPalindrome(ListNode head) {
    	if(head == null)
    		return true;
    	ListNode slow = head;
    	ListNode fast = head;
    	while(fast != null && fast.next != null){
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	//Reverse
    	ListNode firstHalf = head;
    	ListNode secondHalf = Reverse(slow);
    	
    	while(firstHalf != null && secondHalf != null){
    		if(firstHalf.val != secondHalf.val)
    			return false;
    		firstHalf = firstHalf.next;
    		secondHalf = secondHalf.next;
    	}
    	return true;
    }
}
