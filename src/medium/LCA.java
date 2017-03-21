package medium;

public class LCA {
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(root == null || root == p || root == q) return root;
    	TreeNode leftSub = lowestCommonAncestor(root.left, p, q);
    	TreeNode rightSub = lowestCommonAncestor(root.right, p, q);
    	return leftSub == null ? rightSub : (rightSub == null ? leftSub : root);
    }

}
