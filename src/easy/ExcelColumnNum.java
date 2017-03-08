package easy;

public class ExcelColumnNum {

	public static int titleToNumber(String s) {
		int length = s.length();
		if(s == null || length == 0)
			return 0;
		
		int result = 0;
		for(int i = length - 1; i >= 0; --i){
			result += (int)Math.pow(26, length - 1 - i) * (s.charAt(i) - 'A' + 1); 
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(titleToNumber("BB"));
	}

}
