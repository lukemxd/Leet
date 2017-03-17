package medium;

public class FindPeakElement {

	private static int findPeakElementHelper(int[] nums, int left, int right){
		if(left == right) return left;
		else if(left == right - 1){
			if(nums[left] > nums[right]) return left;
			else return right;
		}else{ 
			int mid = left + ((right - left) / 2);
			if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
    		else if(nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1])
    			 return findPeakElementHelper(nums, mid + 1, right);
    		else
    			return findPeakElementHelper(nums, left, mid -1);
		}
	}
	
    public static int findPeakElement(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return -1;
    	int left = 0, right = nums.length - 1;
    	return findPeakElementHelper(nums, left, right);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{2, 1, 2};
		System.out.println(findPeakElement(nums));
	}

}
