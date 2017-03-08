package easy;

public class MergeTwoLists {
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead;
		ListNode cur1 = l1;
		ListNode cur2 = l2;
		
		while(cur1 != null && cur2 != null){
			if(cur1.val >= cur2.val){
				cur.next = cur2;
				cur2 = cur2.next;
			}
			else{
				cur.next = cur1;
				cur1 = cur1.next;
			}
			cur = cur.next;
		}
		
		while(cur1 != null){
			cur.next = cur1;
			cur1 = cur1.next;
			cur = cur.next;
		}
		
		while(cur2 != null){
			cur.next = cur2;
			cur2 = cur2.next;
			cur = cur.next;	
		}
		return dummyHead.next;
    }

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}
