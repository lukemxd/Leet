package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		Map<Character, Integer> table = new HashMap<>();
		for(int i = 0; i < s.length(); ++i){
			if(table.containsKey(s.charAt(i))){
				table.put(s.charAt(i), table.get(s.charAt(i)) + 1);
			}else
				table.put(s.charAt(i), 1);
		}
		
		for(int j = 0; j < t.length(); ++j){
			if(table.containsKey(t.charAt(j))){
				table.put(t.charAt(j), table.get(t.charAt(j)) - 1);
				if(table.get(t.charAt(j)) == 0)
					table.remove(t.charAt(j));
			}else
				return false;
		}
		
		return table.isEmpty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "anagrama", s2 = "nagaram";
		System.out.println(isAnagram(s1, s2));
	}

}
