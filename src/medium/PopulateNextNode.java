package medium;

public class PopulateNextNode {
	
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left, right, next;
	    TreeLinkNode(int x) { val = x; }
	}
	
	/*private void connectHelper(TreeLinkNode node){
		TreeLinkNode iter = node;
		while(iter != null){
			iter.left.next = iter.right == null ? null : iter.right;
			iter.right.next = iter.next == null ? null : iter.next.left;
			iter = iter.next;
		}
	}*/

    public void connect(TreeLinkNode root) {
    	if(root == null)
    		return;
    	root.next = null;
    	TreeLinkNode current = root;
    	while(current != null && current.left != null){
    		TreeLinkNode iter = current;
    		while(iter != null){
    			iter.left.next = iter.right == null ? null : iter.right;
    			iter.right.next = iter.next == null ? null : iter.next.left;
    			iter = iter.next;
    		}
    		current = current.left;
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
