package medium;

public class ColorSorting {
	
	private static void Swap(int[] nums, int a, int b){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

    public static void sortColors(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return;
    	int small = 0, equal = 0, large = nums.length - 1;
    	while(equal <= large){
    		if(nums[equal] < 1) Swap(nums, equal++, small++); 
    		else if(nums[equal] == 1) equal++;
    		else Swap(nums, equal, large--); 
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1, 0};
		sortColors(nums);
	}

}
