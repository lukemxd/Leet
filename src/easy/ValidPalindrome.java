package easy;

public class ValidPalindrome {
	
    public static boolean isPalindrome(String s) {
    	if(s == null || s.length() == 0)
    		return true;
    	int i = 0, j = s.length() - 1;
    	while(i < j){
    		while(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') && 
    			  !(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') &&
    			  !(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
    			if(i < s.length() - 1) i++;
    			else return true;
    		}
    			
    		while(!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') && 
      			  !(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') &&
      			  !(s.charAt(j) >= '0' && s.charAt(j) <= '9')){
    			if(j > 0) j--;
    			else return true;
    		}
    		if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
    		i++;
    		j--;
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("0P"));
	}

}
