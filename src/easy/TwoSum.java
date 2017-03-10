package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
    	if(nums == null || nums.length == 0)
    		return null;
    	Map<Integer, Integer> table = new HashMap<>();
    	int[] result = new int[2];
    	for(int i = 0; i < nums.length; ++i){
    		//if(nums[i] <= target){
    			int second = target - nums[i];	
    			if(table.containsKey(nums[i])){
    				result[0] = table.get(nums[i]);
    				result[1] = i;
    				return result;
    			}else{
    				table.put(second, i);
    			}
    		//}
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{2, 11, 7, 15};
		int[] result = twoSum(input, 9);
		for(int in : result)
			System.out.print(in + " ");
	}

}
