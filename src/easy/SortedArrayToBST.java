package easy;

public class SortedArrayToBST {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static TreeNode createNodes(int[] nums, int start, int end){
		if(start > end)
			return null;
		
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = createNodes(nums, start, mid - 1);
		node.right = createNodes(nums, mid + 1, end);
		return node;
	}
	
	public static TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null || nums.length == 0)
			return null;
		
		int start = 0, end = nums.length - 1;
		return createNodes(nums, start, end);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
