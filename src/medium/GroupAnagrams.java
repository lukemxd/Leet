package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
    	if(strs == null || strs.length == 0)
    		return Collections.emptyList();
    	Map<String, List<String>> table = new HashMap<>();
    	for(String str : strs){
    		char[] charArray = str.toCharArray();
    		Arrays.sort(charArray);
    		String newStr = new String(charArray);
    		if(!table.containsKey(newStr)){
    			table.put(newStr, new ArrayList<>());
    		}
    		table.get(newStr).add(str);
    	}
    	List<List<String>> result = new ArrayList<>();
    	for(Map.Entry<String, List<String>> entry : table.entrySet())
    		result.add(entry.getValue());
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}

}
