package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectSquares {
	
	/*************
	 * dp[0] = 0 
	   dp[1] = dp[0]+1 = 1
       dp[2] = dp[1]+1 = 2
       dp[3] = dp[2]+1 = 3
       dp[4] = Min{ dp[4-1*1]+1, dp[4-2*2]+1 } 
             = Min{ dp[3]+1, dp[0]+1 } 
             = 1				
       dp[5] = Min{ dp[5-1*1]+1, dp[5-2*2]+1 } 
             = Min{ dp[4]+1, dp[1]+1 } 
             = 2
						.
						.
						.
       dp[13] = Min{ dp[13-1*1]+1, dp[13-2*2]+1, dp[13-3*3]+1 } 
              = Min{ dp[12]+1, dp[9]+1, dp[4]+1 } 
              = 2
						.
						.
						.
	   dp[n] = Min{ dp[n - i*i] + 1 },  n - i*i >=0 && i >= 1
	**************/
	
	
	private static List<Integer> dp = new ArrayList<>();
		
    public static int numSquares(int n) {
    	//int[] dp = new int[n + 1];
    	//Collections.fill(dp, Integer.MAX_VALUE);
    	//Arrays.fill(dp, Integer.MAX_VALUE);
    	//dp[0] = 0;
    	if(dp.size() == 0) dp.add(0);
    	if(n > dp.size() - 1){
    		//dp.add(0);
        	for(int i = dp.size(); i <= n; ++i) {
        		int min = Integer.MAX_VALUE;
        		for(int j = 1; j * j <= i; ++j) {
        			min = Math.min(min, dp.get(i - j * j) + 1);
        		}
        		dp.add(min);//set(i, min);//[i] = min;
        	}			
    	}else return dp.get(n);
    	
    	return dp.get(n);//[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numSquares(1));
		System.out.println(numSquares(48));
		System.out.println(numSquares(49));
		System.out.println(numSquares(47));
	}

}
