package easy;

public class ReDupSortedArry {

    public static int removeDuplicates(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return 0;
    	int slow = 0, fast = 1;
    	while(fast < nums.length){
    		if(nums[slow] != nums[fast]){
    			nums[++slow] = nums[fast];
    		}
    		fast++;
    	}
    	return slow + 1; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1, 1, 2, 2, 2, 3};
		System.out.println(removeDuplicates(input));
	}

}
