package medium;

public class IncreasingTripleSubseq {

    public boolean increasingTriplet(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return false;
    	int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
    	for(int in : nums){
    		if(in <= a) a = in;
    		else if(in <= b) b = in;
    		else return true;
    	}
    	return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
