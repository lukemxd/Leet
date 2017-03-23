package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubWithoutRepeated {
	
    public static int lengthOfLongestSubstring(String s) {
    	if(s == null || s.length() == 0) return 0;
    	Map<Character, Integer> table = new HashMap<>();
    	int currentStart = 0, maxLength = 1;
    	for(int i = 0; i < s.length(); ++i){
    		if(table.containsKey(s.charAt(i)) && table.get(s.charAt(i)) >= currentStart){
    			maxLength = Math.max(maxLength, i - currentStart);
    			currentStart = table.get(s.charAt(i)) + 1;
    		}	
    		table.put(s.charAt(i), i);
    	}
    	maxLength = Math.max(maxLength, s.length() - currentStart);
    	return maxLength;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abba";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
