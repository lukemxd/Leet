package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
    public static List<String> generateParenthesis(int n) {
    	List<String> result = new ArrayList<>();
    	generateParenthesisHelper(result, "", n, n);
    	return result;
    }
    
    private static void generateParenthesisHelper(List<String> result, String str, int left, int right){
    	if(left > right)
    		return;
    	if(left > 0)
    		generateParenthesisHelper(result, str + "(", left - 1, right);
    	if(right > 0)
    		generateParenthesisHelper(result, str + ")", left, right - 1);
    	if(left == 0 && right == 0){
    		result.add(str);
    		return;
    	}	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> result = generateParenthesis(3);
		for(String str : result)
			System.out.println(str);
	}

}
