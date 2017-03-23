package medium;

public class ValidateBST {
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	private boolean isValidBSTHelper(TreeNode root, long lower, long upper){
		if(root == null) return true;
		else if(root.val <= lower || root.val >= upper) return false;
		return isValidBSTHelper(root.left, lower, root.val) && 
			   isValidBSTHelper(root.right, root.val, upper);
	}
	
	public boolean isValidBST(TreeNode root) {
		return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
