package medium;

public class JumpGame {
	
    public static boolean canJump(int[] nums) {
    	if(nums == null || nums.length < 2) return true;
    	for(int i = 0; i < nums.length;){
    		int nextMaxSteps = nums[i];
    		int nextIndex = 0, nextNum = 0;
    		for(int j = i + 1; j <= i + nextMaxSteps && j < nums.length; ++j){
    			if(nums[j] != 0 && nums[j] + j >= nextNum){
    				nextNum = nums[j] + j;
    				nextIndex = j;
    			}
    		}
    		if(nextIndex == nums.length - 1 || nextMaxSteps + i >= nums.length - 1) return true;
    		else if(nextIndex == 0) return false;
    		else i = nextIndex;
    	}
    	return true;
    }
    
    public static boolean canJump2(int[] nums) {
    	if(nums == null || nums.length < 2) return true;
    	int furthestIndex = 0;
    	for(int i = 0; i <= furthestIndex && furthestIndex < nums.length; ++i){
    		furthestIndex = Math.max(furthestIndex, i + nums[i]);
    	}
    	return furthestIndex >= nums.length - 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{5,9,3,2,1,0,2,3,3,1,0,0};
		System.out.println(canJump2(nums));
	}

}
