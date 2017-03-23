package medium;

public class MaxProductSubArr {
	
    public int maxProduct(int[] nums) {
    	if(nums == null || nums.length == 0) return 0;
    	int max = nums[0], min = nums[0], result = nums[0];
    	for(int i = 1; i < nums.length; ++i){
    		int temp = max;
    		max = Math.max(nums[i], Math.max(min * nums[i], max * nums[i]));
    		min = Math.min(nums[i], Math.min(min * nums[i], temp * nums[i]));
    		result = Math.max(result, max);
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
