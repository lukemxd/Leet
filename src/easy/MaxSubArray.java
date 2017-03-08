package easy;

public class MaxSubArray {

	public int maxSubArray(int[] nums) {
		int sum = 0, max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; ++i){
			if(sum < 0)
				sum = nums[i];
			else{
				sum += nums[i];
			}
			max = Math.max(max, sum);
		}
		return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
