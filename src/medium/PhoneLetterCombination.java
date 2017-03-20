package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneLetterCombination {
	
	private static final String[] MAPPING = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
    private static void letterCombinationHelper(List<String> result, char[] partial, String digits, int index){
    	if(index == digits.length())
    		result.add(new String(partial));
    	else{
    		for(int i = 0; i < MAPPING[digits.charAt(index) - '0'].length(); ++i){
    			partial[index] = MAPPING[digits.charAt(index) - '0'].charAt(i);
    			letterCombinationHelper(result, partial, digits, index + 1);
    		}
    	}
    }
	
	public static List<String> letterCombinations(String digits) {
    	if(digits == null || digits.length() == 0)
    		return Collections.emptyList();
    	List<String> result = new ArrayList<>();
    	char[] chars = new char[digits.length()];
    	letterCombinationHelper(result, chars, digits, 0);
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}

}
