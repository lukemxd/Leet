package easy;


public class PlusOne {

    public static int[] plusOne(int[] digits) {
    	//if(digits == null || digits.length == 0)
    	//	return digits;
    	int carry = 0;
    	digits[digits.length - 1] += 1;
    	for(int i = digits.length - 1; i >= 0; --i){
        	if(carry == 1)
        		digits[i] += 1;
    		if(digits[i] == 10){
        		digits[i] = 0;
        		carry = 1;
        	}
        	else
        		carry = 0;	
    	}
    	if(digits[0] == 0){
    		int[] result = new int[digits.length + 1];
    		result[0] = 1;
    		return result;
    	}
    	else
    		return digits;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{9, 9, 8};
		int[] result = plusOne(input);
		for(int in : result)
			System.out.print(in + " ");
	}

}
