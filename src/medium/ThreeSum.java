package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	
    public static List<List<Integer>> threeSum(int[] nums) {
    	if(nums == null || nums.length < 3) return Collections.emptyList();
    	List<List<Integer>> result = new ArrayList<>();
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length - 2; ++i){
    		if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
    			int left = i + 1, right = nums.length - 1, sum = 0 - nums[i];	
    			while(left < right){
    				if(nums[left] + nums[right] == sum){
    					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
    					while(left < right && nums[left] == nums[left + 1]) left++;
    					while(left < right && nums[right] == nums[right - 1]) right--;
    					left++;
    					right--;
    				}else if(nums[left] + nums[right] > sum) right--;
    				else left++;
    			}
    		}
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}

}
