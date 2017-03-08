package easy;

public class ReverseString {

	private static void Swap(char[] s, int a, int b){
		char temp = s[a];
		s[a] = s[b];
		s[b] = temp;
	}
	
	public static String reverseString(String s) {
		if(s == null || s.length() == 0)
			return "";
		//char[] chr = s.toCharArray();
		////char[] result = new char[s.length()];
		//int start = 0, end = s.length() - 1;
		//while(start < end){
		//	Swap(chr, start++, end--);
		//}
		////for(int i = 0; i < s.length(); ++i){
		////	result[i] = s.charAt(s.length() - i - 1);
		////}
		////return String.valueOf(result);
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.print(reverseString(s));
	}

}
