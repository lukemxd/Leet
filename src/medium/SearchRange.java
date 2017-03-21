package medium;

public class SearchRange {
	
    public static int[] searchRange(int[] nums, int target) {
    	int start = -1, end = -1, startIdx = 0;
    	if(nums == null || nums.length == 0)
    		return new int[]{start, end};
    	int left = 0, right = nums.length - 1;
    	while(left <= right){
    		int mid = left + ((right - left) / 2);
    		if(nums[mid] > target) right = mid - 1;
    		else if(nums[mid] == target){
    			startIdx = mid;
    			break;
    		}
    		else left = mid + 1;
    	}
    	if(left <= right){
    		start = startIdx; end = startIdx;
        	while(start >= 0 && nums[start] == target) start--;
        	while(end < nums.length && nums[end] == target) end++;	
        	start++;
        	end--;
    	}
    	return new int[]{start, end};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1};
		int[] result = searchRange(nums, 0);
		System.out.println(result[0] + " " + result[1]);
	}

}
