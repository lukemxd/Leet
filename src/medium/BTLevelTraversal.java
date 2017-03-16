package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BTLevelTraversal {

	public static class TreeNode {
		int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
    public static List<List<Integer>> levelOrder(TreeNode root) {
    	if(root == null)
    		return Collections.emptyList();
    	List<List<Integer>> result = new ArrayList<>();
    	Deque<TreeNode> queue = new LinkedList<>();
    	TreeNode current = root;
    	queue.addLast(current);
    	while(!queue.isEmpty()){
    		List<Integer> level = new ArrayList<>();
    		int num = queue.size();
    		for(int i = 0; i < num && !queue.isEmpty(); ++i){
    			current = queue.removeFirst();
    			if(current != null){
    				level.add(current.val);
    				if(current.left != null) queue.addLast(current.left);
    				if(current.right != null) queue.addLast(current.right);
    			}
    		}
    		if(level.size() > 0) result.add(level);
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = null;
		root.left.left = new TreeNode(3);
		root.left.right = null;
		root.left.left.left = new TreeNode(4);
		root.left.left.right = null;
		root.left.left.left.left = new TreeNode(5);
		
		List<List<Integer>> result = levelOrder(root);
		for(List<Integer> list : result){
			for(Integer in : list)
				System.out.print(in + " ");
			System.out.println();
		}
	}

}
