package easy;

public class CountAndSay {
	
    public static String countAndSay(int n) {
    	String str = "1";
    	while(n-- > 0){
    		StringBuilder sb = new StringBuilder();
    		for(int i = 0; i < str.length(); ++i){
    			int count = 1;
    			while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
    				++i;
    				++count;
    			}
    			sb.append(count);
    			sb.append(str.charAt(i));
        	}	
    		str = sb.toString();
    	}
    	return str;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(2));
	}

}
