package easy;

public class MaxDepth {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	
	private int findMaxDepth(TreeNode root, int d){
		if(root == null)
			return d;
		
		d++;
		return Math.max(findMaxDepth(root.left, d), findMaxDepth(root.right, d));
	}

	public int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		
		int depth = 1;
		int leftDepth = findMaxDepth(root.left, depth);
		int rightDepth = findMaxDepth(root.right, depth);
		return Math.max(leftDepth, rightDepth);
    }
	
	public int maxDepth2(TreeNode root) {
		if(root == null)
			return 0;
		return Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
    }
}
