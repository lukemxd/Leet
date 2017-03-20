package medium;

public class LongestSubWithKRepeated {
	
	private static int longestSubStringHelper(char[] chars, int start, int end, int k){
		if(end - start < k) return 0;
		int[] count = new int[26];
    	for(int i = start; i < end; ++i){
    		int index = chars[i] - 'a';
    		count[index]++;
    	}
		for(int i = 0; i < 26; ++i){
			if(count[i] < k && count[i] > 0){
				for(int j = start; j < end; ++j){
					if(chars[j] == i + 'a')
						return Math.max(longestSubStringHelper(chars, start, j, k), 
										longestSubStringHelper(chars, j + 1, end, k));				
				}
			}
		}
		return end - start;
	}
	
    public static int longestSubstring(String s, int k) {
    	char[] chars = s.toCharArray();
    	return longestSubStringHelper(chars, 0, s.length(), k);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abacba";
		int k = 2;
		System.out.println(longestSubstring(s, k));
	}

}
