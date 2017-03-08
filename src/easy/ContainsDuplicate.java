package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length == 0)
			return false;
		Set<Integer> container = new HashSet<>();
		for(int in : nums){
			if(!container.add(in))
				return true;
		}
		return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
