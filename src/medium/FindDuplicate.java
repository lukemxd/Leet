package medium;

import java.util.Arrays;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return -1;
    	int sum = 0, diff = 0, duplicate = 0;
    	for(int in : nums)
    		sum += in;
    	int L = nums.length;
    	for(int i = 1; i < L; ++i){
    		int index = Arrays.binarySearch(nums, i);
    		if(index < 0){
    			diff += i;
    			duplicate++;
    		}
    	}
    	int cons = L * (L - 1) / 2;
    	return (sum - cons + diff) / (duplicate + 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1, 2, 3, 5, 6, 6, 6, 6, 8, 9, 10};
		System.out.println(findDuplicate(input));
	}

}
