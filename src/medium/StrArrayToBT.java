package medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class StrArrayToBT {

	public static class TreeNode {
		Integer val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(Integer x) { 
	    	this.val = x;
	    }
	    TreeNode(Integer x, TreeNode l, TreeNode r) { 
	    	this.val = x;
	    	this.left = l;
	    	this.right = r;
	    }
	}
	
	public static TreeNode constructFromBFS(Integer[] values){
		if(values == null || values.length == 0)
			return null;
		Deque<TreeNode> queue = new LinkedList<>();
		TreeNode root = new TreeNode(values[0]);
		queue.addLast(root);
		int i = 1;
		while(!queue.isEmpty() && i < values.length){
			TreeNode current = queue.poll();
			if(current != null && i < values.length){
				current.left = new TreeNode(values[i++]);
				queue.addLast(current.left);
				if(i < values.length){
					current.right = new TreeNode(values[i++]);
					queue.addLast(current.right);	
				}
			}
		}
		return root;
	}
	
	public static List<Integer> BFSTraverse(TreeNode root){
		List<Integer> result = new ArrayList<>();
		Deque<TreeNode> queue = new LinkedList<>();
		queue.addLast(root);
		while(!queue.isEmpty()){
			TreeNode current = queue.removeFirst();
			result.add(current == null ? null : current.val);
			if(current.val != null){
				queue.addLast(current.left);
				queue.addLast(current.right);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] values = new Integer[] {1, 2, 3, null, null, null, null};
		TreeNode root = constructFromBFS(values);
		List<Integer> result = BFSTraverse(root);
		for(Integer in : result)
			System.out.print(in);
	}

}
