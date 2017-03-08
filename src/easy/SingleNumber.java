package easy;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; ++i){
			result ^= nums[i];
		}
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1, 2, 3, 4, 5, 3, 2, 1, 4};
		System.out.print(singleNumber(input));
	}

}
