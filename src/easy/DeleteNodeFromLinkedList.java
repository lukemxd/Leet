package easy;

public class DeleteNodeFromLinkedList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public void deleteNode(ListNode node) {
		if(node == null || node.next == null)
			return;
		
		node.val = node.next.val;
		node.next = node.next.next;
    }
	
}
