package easy;


public class IntegerSum {

	public static int getSum(int a, int b){
		if(b == 0)
			return a;
		
		int sum, carry;
	    sum = a ^ b;
	    carry = (a & b)<<1;
	    return getSum(sum, carry);
	}
	
	public static void getSum2(int a, int b) {
		String A = Integer.toBinaryString(a);
		String B = Integer.toBinaryString(b);
		char[] result = new char[]{};
		int flag = 0, carry = 0;
		
		while(flag < A.length() || flag < B.length()){
			int bit = A.charAt(flag) - '0' ^ B.charAt(flag) - '0' ^ carry;
			if(A.charAt(flag) - '0' == 1 && B.charAt(flag) - '0' == 1){
				carry = 1;
			}
			else{
				carry = 0;
			}
			result[flag] = (char)bit; 
			flag++;
		}
		
		while(flag < A.length()){
			int bit = A.charAt(flag) - '0' ^ carry;
			if(A.charAt(flag) - '0' == 1 && carry == 1){
				carry = 1;	
			}
			else
				carry = 0;
			
			result[flag] = (char)bit; 
			flag++;
		}
		
		while(flag < B.length()){
			int bit = B.charAt(flag) - '0' ^ carry;
			if(B.charAt(flag) - '0' == 1 && carry == 1){
				carry = 1;	
			}
			else
				carry = 0;
			
			result[flag] = (char)bit; 
			flag++;
		}
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getSum(2, 3));
	}

}
