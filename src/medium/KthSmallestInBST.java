package medium;

import java.util.Deque;
import java.util.LinkedList;

public class KthSmallestInBST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
    public int kthSmallest(TreeNode root, int k) {
    	Deque<TreeNode> stack = new LinkedList<>();
    	int result = -1;
    	TreeNode current = root;
    	while(!stack.isEmpty() || current != null){
    		if(current != null){
        		stack.addFirst(current);
        		current = current.left;
        	}else{
        		current = stack.removeFirst();
        		if(--k == 0) return current.val;	
        		current = current.right;
        	}
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
