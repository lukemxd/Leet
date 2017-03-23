package medium;

public class LongestPalindrSubStr {
	
	private static boolean isPalindrome(String str, int start, int end){
		if(start < 0) return false;
		while(start < end){
			if(str.charAt(start++) != str.charAt(end--)) return false;
		}
		return true;
	}
	
    public static String longestPalindrome(String s) {
    	if(s == null || s.length() == 0)
    		return null;
    	String result = "";
    	int currentLength = 0;
		for(int i = 0; i < s.length(); ++i){
			if(isPalindrome(s, i - currentLength - 1, i)){
				result = s.substring(i - currentLength - 1, i + 1);
				currentLength += 2;
			}else if(isPalindrome(s, i - currentLength, i)){
				result = s.substring(i - currentLength, i + 1);
				currentLength += 1;
			}
		}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		System.out.println(longestPalindrome(s));
	}

}
