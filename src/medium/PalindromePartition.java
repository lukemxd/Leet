package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromePartition {
	
	private static boolean isPalindrome(String str, int start, int end){
		while(start < end){
			if(str.charAt(start++) != str.charAt(end--)) return false;
		}
		return true;
	}
	
	private static void partitionHelper(List<List<String>> result, List<String> temp, String s, int index){
		if(index == s.length())
			result.add(new ArrayList<>(temp));
		else{
			for(int i = index; i < s.length(); ++i){
				if(isPalindrome(s, index, i)){
					temp.add(s.substring(index, i + 1));
					partitionHelper(result, temp, s, i + 1);
					temp.remove(temp.size() - 1);
				}
			}
		}
	}
	
    public static List<List<String>> partition(String s) {
    	if(s == null || s.length() == 0)
    		return Collections.emptyList();
    	List<List<String>> result = new ArrayList<>();
    	partitionHelper(result, new ArrayList<>(), s, 0);
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		System.out.println(partition(s));
	}

}
