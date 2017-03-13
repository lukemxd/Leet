package medium;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
	
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	//all four list have the same length
    	if(A == null || A.length == 0)
    		return 0;
    	int count = 0;
    	Map<Integer, Integer> tableAB = new HashMap<>();
    	for(int i = 0; i < A.length; ++i){
    		for(int j = 0; j < B.length; ++j){
    			int sumAB = A[i] + B[j];
    			tableAB.put(sumAB, 
    						tableAB.containsKey(sumAB) ? tableAB.get(sumAB) + 1 : 1);
    		}
    	}
    	for(int i = 0; i < C.length; ++i){
    		for(int j = 0; j < D.length; ++j){
    			int sumCD = C[i] + D[j];
    			if(tableAB.containsKey(-sumCD))
    				count += tableAB.get(-sumCD);
    		}
    	}
    	return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{1, 2};
		int[] B = new int[]{-2,-1};
		int[] C = new int[]{-1, 2};
		int[] D = new int[]{0, 2};
		System.out.println(fourSumCount(A, B, C, D));
	}

}
