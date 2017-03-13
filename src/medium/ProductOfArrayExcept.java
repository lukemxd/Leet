package medium;

public class ProductOfArrayExcept {

    public static int[] productExceptSelf(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return null;
    	int[] result = new int[nums.length];
    	long productWithoutZero = 1;
    	int numOfZero = 0;
    	for(int i = 0; i < nums.length; ++i){
    		if(numOfZero > 1) break;
    		if(nums[i] != 0)
    			productWithoutZero *= nums[i];
    		else numOfZero++;	
    	}
    	if(numOfZero == 0){
    		for(int j = 0; j < nums.length; ++j){
    			result[j] = (int)(productWithoutZero / nums[j]);
    		}
    	}
    	else if(numOfZero == 1){
    		for(int j = 0; j < nums.length; ++j){
    			if(nums[j] == 0)
    				result[j] = (int)productWithoutZero;
    			else result[j] = 0;
    		}
    	}
    	return result;
    }
	
    public static int[] productExceptSelf2(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return null;
    	int[] result = new int[nums.length];
    	int temp = 1;
    	for(int i = 0; i < nums.length; ++i){
    		result[i] = temp;
    		temp *= nums[i];
    	}
    	temp = 1;
    	for(int j = nums.length - 1; j >= 0; --j){
    		result[j] *= temp;
    		temp *= nums[j];
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1, 2, 8, 0, 6};
		int[] result = productExceptSelf(input);
		for(int in : result)
			System.out.print(in);
	}

}
