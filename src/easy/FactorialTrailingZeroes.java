package easy;

public class FactorialTrailingZeroes {
	
    public static int trailingZeroes(int n) {
    	if(n == 0)
    		return 0;
    	return n / 5 + trailingZeroes(n / 5);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(23));
	}

}
