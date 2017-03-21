package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConstructBTFromPreInorder {
	
	public static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	public static TreeNode buildTree(int[] preorder, int[] inorder){
		Map<Integer, Integer> indexOfInorderNode = new HashMap<Integer, Integer>();
		for(int i = 0; i < inorder.length; ++i ){
			indexOfInorderNode.put(inorder[i], i);
		}
		
		return binaryTreeFromPreInorderHelper(preorder, 0, preorder.length, 0, inorder.length, indexOfInorderNode);
	}
	
	private static TreeNode binaryTreeFromPreInorderHelper(int[] preorder, 
			int preorderStart, int preorderEnd, int inorderStart, int inorderEnd, Map<Integer, Integer> indexOfInorderNode){
		
		if(preorderStart >= preorderEnd || inorderStart >= inorderEnd)
			return null;
		
		int rootInorderIndex = indexOfInorderNode.get(preorder[preorderStart]);
		int leftSubtreeSize = rootInorderIndex - inorderStart;
		
		TreeNode node = new TreeNode(preorder[preorderStart]);
		node.left =	binaryTreeFromPreInorderHelper(preorder, preorderStart + 1, preorderStart + 1 + leftSubtreeSize, inorderStart, rootInorderIndex, indexOfInorderNode); 
		node.right = binaryTreeFromPreInorderHelper(preorder, preorderStart + 1 + leftSubtreeSize, preorderEnd, rootInorderIndex + 1, inorderEnd, indexOfInorderNode);
		return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = new int[]{1, 2};
		int[] inorder = new int[]{2, 1};
		TreeNode root = buildTree(preorder, inorder);
	}

}
