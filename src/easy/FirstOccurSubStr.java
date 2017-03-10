package easy;

public class FirstOccurSubStr {

    public static int strStr(String haystack, String needle) {
    	int hLength = haystack.length(), nLength = needle.length();
    	if(hLength < nLength) return -1;
    	int i = 0, j = 0;
    	while(true){
    		while(true){
    			if(j == nLength) return i;
    			if(i + j == hLength) return -1;
    			if(haystack.charAt(i + j) != needle.charAt(j)){
    				j = 0;
    				break;
    			}
    			++j;
    		}
    		++i;
    	}
    }
    
    public int strStr2(String haystack, String needle) {
    	  for (int i = 0; ; i++) {
    	    for (int j = 0; ; j++) {
    	      if (j == needle.length()) return i;
    	      if (i + j == haystack.length()) return -1;
    	      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    	    }
    	  }
    	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi","issipi"));
	}

}
