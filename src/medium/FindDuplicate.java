package medium;


public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return -1;
    	int left = 1, right = nums.length - 1;
    	while(left < right){
    		int mid = left + ((right - left) / 2);
    		int count = 0;
    		for(int in : nums)
    			if(in <= mid) count++;
    		if(count > mid)
    			right = mid;
    		else left = mid + 1;
    	}
    	return left;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{5, 2, 5, 3, 1, 4, 6, 5, 8, 9, 10};
		System.out.println(findDuplicate(input));
	}

}
