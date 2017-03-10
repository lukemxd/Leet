package easy;

public class SqrtX {

    public static int mySqrt(int x) {
    	if(x == 0) return 0;
    	if(x == 1) return 1;
    	long left = 0, right = x, mid = 0; //must be long type
    	while(left <= right){
    		mid = left + ((right - left) / 2);	
    		long square = mid * mid;
    		if(square > x) right = mid - 1;
    		else if(square < x) left = mid + 1;
    		else return (int)mid;
    	}
    	return (int)left - 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(2147395599));
	}

}
