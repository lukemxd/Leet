package medium;

public class PowerXN {

    public static double myPow(double x, int n) {
    	if(n == 0) return 1;
    	if((n <= Integer.MIN_VALUE || n >= Integer.MAX_VALUE) && Math.abs(x) != 1) return 0;
    	if(n < 0){
    		n = -n;
    		x = 1 / x;
    	}
    	return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(1.0, 2147483647));
	}

}
