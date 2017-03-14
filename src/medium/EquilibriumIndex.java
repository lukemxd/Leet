package medium;

import java.util.HashMap;
import java.util.Map;

public class EquilibriumIndex {
	
    public int solution(int[] A) {
        // write your code in Java SE 8
    	Map<Integer, Integer> table = new HashMap<>();
    	int sum = 0;
    	for(int i = 0; i < A.length; ++i){
    		sum += A[i];
    		if(!table.containsKey(i)){
    			table.put(i, sum);
    		}
    	}
    	for(int j = 0; j < A.length; ++j){
    		if(j == 0 && sum - A[j] == 0)
    			return 0;
    		if(j > 0 && sum - A[j] - table.get(j - 1) == table.get(j - 1))
				return j;
    	}
    	return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
