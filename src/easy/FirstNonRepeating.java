package easy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class FirstNonRepeating {

	//Too complex
	public static int firstUniqChar(String s) {
		LinkedHashMap<Character, List<Integer>> table = new LinkedHashMap<>();
		List<Integer> indexes;
		for (int i = 0; i < s.length(); ++i) {
			if(table.containsKey(s.charAt(i))){
				indexes = table.get(s.charAt(i));
			}else{
				indexes = new ArrayList<>();
			}
			indexes.add(i);
			table.put(s.charAt(i), indexes);	
		}
		
		for (Map.Entry<Character, List<Integer>> entry : table.entrySet()) {
			if(entry.getValue().size() == 1)
				return entry.getValue().get(0);
		}
		return -1;
    }
	
	public int firstUniqChar2(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(firstUniqChar("leetcode"));
	}

}
