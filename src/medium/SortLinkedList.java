package medium;

public class SortLinkedList {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    public ListNode sortList(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	ListNode current = null, slow = head, fast = head;
    	while(fast != null && fast.next != null){
    		current = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	current.next = null;
    	
    	ListNode p1 = sortList(head);
    	ListNode p2 = sortList(slow);
    	return merge(p1, p2);
    }
    
    private ListNode merge(ListNode p1, ListNode p2){
    	ListNode dummyHead = new ListNode(0);
    	ListNode current = dummyHead;
    	while(p1 != null && p2 != null){
    		if(p1.val < p2.val){
    			current.next = p1;
    			p1 = p1.next;
    		}else{
    			current.next = p2;
    			p2 = p2.next;
    		}
    		current = current.next;
    	}
    	while(p1 != null){
    		current.next = p1;
			p1 = p1.next;
			current = current.next;
    	}
    	while(p2 != null){
    		current.next = p2;
			p2 = p2.next;
			current = current.next;
    	}
    	return dummyHead.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
