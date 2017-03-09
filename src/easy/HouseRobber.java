package easy;

public class HouseRobber {

    public int rob(int[] nums) {
    	if(nums.length == 0)
    		return 0;
    	int includePrev = 0, excludePrev = 0;
    	for(int in : nums){
    		int temp = includePrev;
    		includePrev = excludePrev + in;
    		excludePrev = Math.max(temp, excludePrev);
    	}
    	return Math.max(includePrev, excludePrev);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
