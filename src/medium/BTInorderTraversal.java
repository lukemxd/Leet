package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BTInorderTraversal {

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	if(root == null)
    		return Collections.emptyList();
    	List<Integer> result = new ArrayList<>();
    	Deque<TreeNode> stack = new LinkedList<>();
    	TreeNode current = root;
    	while(!stack.isEmpty() || current != null){
    		if(current != null){
    			stack.addFirst(current);
    			current = current.left;	
    		}
    		else{
    			current = stack.removeFirst();
    			result.add(current.val);
    			current = current.right;
    		}
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
