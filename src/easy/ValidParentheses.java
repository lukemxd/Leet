package easy;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
	
    public static boolean isValid(String s) {
    	if(s == null || s.length() == 0)
    		return true;
    	Deque<Character> stack = new LinkedList<>();
    	for(int i = 0; i < s.length(); ++i){
    		char c = s.charAt(i);
    		switch (c) {
			case ')':
				if(stack.isEmpty() || stack.removeFirst() != '(')
					return false;
				break;
			case ']':
				if(stack.isEmpty() || stack.removeFirst() != '[')
					return false;
				break;
			case '}':
				if(stack.isEmpty() || stack.removeFirst() != '{')
					return false;
				break;
			default:
				stack.addFirst(c);
			}
    	}
    	return stack.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("]"));
	}

}
