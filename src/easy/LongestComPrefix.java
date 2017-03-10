package easy;

import java.util.Arrays;

public class LongestComPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
			return "";
        StringBuilder result = new StringBuilder();
        if (strs!= null && strs.length > 0){
            Arrays.sort(strs);
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            for (int i = 0; i < a.length; i ++){
                if (a[i] == b[i]){
                    result.append(a[i]);
                }
                else {
                    return result.toString();
                }
            }
        }
        return result.toString();    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
