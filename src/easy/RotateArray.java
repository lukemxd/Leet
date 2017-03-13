package easy;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
    	if(nums == null || nums.length == 0) return;
    	k %= nums.length;
    	int[] temp = new int[k];
        for(int i = 0; i < k; ++i) temp[i] = nums[nums.length - k + i];
        for(int j = nums.length - k - 1; j >= 0; --j) nums[j + k] = nums[j];
        for(int m = 0; m < k; ++m) nums[m] = temp[m];	
    }
	
    public static void rotate2(int[] nums, int k) {
    	if(nums == null || nums.length == 0) return;
    	k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
		rotate2(nums, 8);
		for(int in : nums)
			System.out.print(in + " ");
	}

}
