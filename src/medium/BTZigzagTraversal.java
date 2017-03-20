package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BTZigzagTraversal {
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	if(root == null)
    		return Collections.emptyList();
    	List<List<Integer>> result = new ArrayList<>();
    	Deque<TreeNode> queue = new LinkedList<>();
    	int direction = 0;
    	TreeNode current = root;
    	queue.addLast(current);
    	while(!queue.isEmpty() && current != null){
    		int size = queue.size();
    		List<Integer> level = new ArrayList<>();
    		for(int i = 0; i < size && !queue.isEmpty(); ++i){
    			current = queue.removeFirst();
    			if(current != null){
    				level.add(current.val);
    				if(current.left != null) queue.addLast(current.left);
    				if(current.right != null) queue.addLast(current.right);
    			}
    		}
    		if(direction == 1) Collections.reverse(level);
    		direction ^= 1;
    		if(level.size() > 0) result.add(level);
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
