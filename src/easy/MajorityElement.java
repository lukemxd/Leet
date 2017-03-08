package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
    }
	
	public static int majorityElement2(int[] nums) {
		Map<Integer, Integer> table = new HashMap<>();
		
		int result = 0;
		for(int in : nums){
			if(table.containsKey(in))
				table.put(in, table.get(in) + 1);
			else
				table.put(in, 1);
			
			if(table.get(in) >= nums.length / 2)
				result = in;
		}
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
