package easy;

import java.util.Arrays;

public class MissingNumber {

	public static int missingNumber(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		Arrays.sort(nums);
		
		for(int i = 0; i <= nums.length; ++i){
			if(i == nums.length || nums[i] != i)
				return i;
		}
		return -1;
    }
	
	public static int missingNumber2(int[] nums) { //xor
	    int res = nums.length;
	    for(int i=0; i<nums.length; i++){
	        res ^= i;
	        res ^= nums[i];
	    }
	    return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1, 0};
		System.out.println(missingNumber2(input));
	}

}
