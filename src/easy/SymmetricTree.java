package easy;

public class SymmetricTree {
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	private boolean isSymmetricHelper(TreeNode node1, TreeNode node2){
		if(node1 == null && node2 == null)
			return true;
		else if((node1 == null && node2 != null) || (node1 != null && node2 == null))
			return false;
		else if(node1 != null && node2 != null && node1.val != node2.val)
			return false;
		else
			return isSymmetricHelper(node1.left, node2.right) &&
				   isSymmetricHelper(node1.right, node2.left);
	}
	
    public boolean isSymmetric(TreeNode root) {
    	if(root == null)
    		return true;
    	return isSymmetricHelper(root.left, root.right);
    }
}
