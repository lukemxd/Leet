package easy;

public class NumOfOneBit {

    public static int hammingWeight(int n) {
    	final int MASK = 1;
    	int nums = 0;
    	while(n != 0){ //2147483648 will be treat as negative so cannot use n > 0
    		nums += (n & MASK);
    		n = n >>> 1;
    	}
    	return nums;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(214748364));
	}

}
