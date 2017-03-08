package easy;

public class RemoveZeroes {

	public static void moveZeroes(int[] nums) {
		if(nums == null || nums.length == 0)
			return;
		
		int index = 0;
		for(int i = 0; i < nums.length; ++i){
			if(nums[i] != 0)
				nums[index++] = nums[i];
		}
		
		while(index < nums.length){
			nums[index++] = 0;
		}
				
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{0, 1, 0, 3, 12}; 
		moveZeroes(input);
	}

}
