package medium;

public class SearchInRotateArray {
	
	private static int searchInSubArray(int[] nums, int start, int end, int target){
		int left = start, right = end;
		while(left <= right){
			int mid = left + ((right - left) / 2);
			if(nums[mid] > target) right = mid - 1;
			else if(nums[mid] < target) left = mid + 1;
			else return mid; 
		}
		return -1;
	}
	
	public static int search(int[] nums, int target) {
		if(nums == null || nums.length == 0)
			return -1;
		int start = 0, end = nums.length - 1;
		while(start < end){
			int mid = start + ((end - start) / 2);
			if(nums[mid] > nums[end])
				start = mid + 1;
			else end = mid;
		}
		int pivotIdx = start;
		int result = -1;
		if(target > nums[nums.length - 1]){
			result = searchInSubArray(nums, 0, pivotIdx - 1, target);
		}else result = searchInSubArray(nums, pivotIdx, nums.length - 1, target);	 	
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
		System.out.println(search(nums, 3));
	}

}
