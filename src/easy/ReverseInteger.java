package easy;

public class ReverseInteger {
	
	private static void Swap(char[] intArray, int a, int b){
		char temp = intArray[a];
		intArray[a] = intArray[b];
		intArray[b] = temp;
	}
	
    public static int reverse(int x) {
    	boolean isNegative = false;
    	long temp = (long)x; 
    	if(temp < 0){
    		temp = -temp;
    		isNegative = true;
    	}
    	if(temp >= 0 && temp <= 9)
    		return isNegative ? -x : x;
    	char[] intArray = String.valueOf(temp).toCharArray();
    	int length = intArray.length;
    	for(int i = 0; i < length / 2; ++i){
    		if(intArray[i] != intArray[length - 1 - i])
    			Swap(intArray, i, length - 1 - i);
    	}
    	//Check if it overflows
    	if(Long.valueOf(String.valueOf(intArray)) > 2147483647)
    		return 0;
    	return isNegative ? -Integer.valueOf(String.valueOf(intArray))  
    			          : Integer.valueOf(String.valueOf(intArray));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-2147483648));
	}

}
