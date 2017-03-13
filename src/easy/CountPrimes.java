package easy;

import java.util.HashMap;
import java.util.Map;

public class CountPrimes {
	
	/*private static Map<Integer, Boolean> table = new HashMap<>();
	
	private static void initialTable(int n){
		if(n > table.entrySet().size()){
			for(int i = table.entrySet().size(); i < n; ++i){
				table.put(i, true);
			}
		}
	}*/

    public static int countPrimes(int n) {
        if (n < 3) return 0;   
        boolean[] f = new boolean[n];
        int count = n / 2; //even number cannot be prime
        for (int i = 3; i * i < n; i += 2) {
            if (!f[i]){
                for (int j = i * i; j < n; j += 2 * i) { 
                	//2 * i (even) + i * i (odd) = (odd)
                    if (!f[j]) {
                        --count;
                        f[j] = true;
                    }
                }	
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(100000000));
		//System.out.println(countPrimes(4));
		//System.out.println(countPrimes(7));
		//System.out.println(countPrimes(2));
	}

}
