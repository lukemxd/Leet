package easy;

public class ClimbStairs {

	//Fibonacci
	public static int climbStairs(int n) {
		if(n == 0) 
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		
		int total = 0, n1 = 1, n2 = 2;
		while(n-- > 2){
			total = n1 + n2;
			n1 = n2;
			n2 = total;
		}
		return total;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(6));
	}

}
