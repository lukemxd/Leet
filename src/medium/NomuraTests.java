package medium;

import java.util.Set;

public class NomuraTests {
	
	public static class Tree {
		  public int x;
		  public Tree l;
		  public Tree r;
		  public Tree(int val){this.x = val;}
	}
	
    public static int solution(Tree T, Set<Integer> set) {
        // write your code in Java SE 8
    	if(T == null)
    		return set.size();
    	set.add(T.x);
    	return Math.max(solution(T.l, set), solution(T.r, set));
    }
    

    public static int solution2(int[][] A){
    	int total = 0;
    	for(int row = 1; row < A.length - 1; ++row){
    		for(int col = 1; col < A.length - 1; ++col){
    			if((A[row][col] < A[row][col - 1] && 
    			    A[row][col] < A[row][col + 1] &&
    			    A[row][col] > A[row - 1][col] &&
    			    A[row][col] > A[row + 1][col]) || 
    			   (A[row][col] > A[row][col - 1] &&
    			    A[row][col] > A[row][col + 1] &&
    			    A[row][col] < A[row - 1][col] &&
     			    A[row][col] < A[row + 1][col]))
    			total++;
    		}
    	}
    	return total;
    }
    
  
    public static int solution3(int[] A){
    	if(A == null || A.length == 0)
    		return 0;
    	//False by default
    	int result = 0;
    	boolean[] aux = new boolean[A.length];
    	for(int i = 0; i < A.length; ++i){
    		//If aux[i] == true, meaning it has been visited so skip
    		if(!aux[i]){
    			aux[i] = true;
    			int index = A[i];
        		int max = 1;
        		while(!aux[index]){
        			aux[index] = true;
        			index = A[index];
        			max++;
        		}
        		result = Math.max(result, max);
    		}
    	}
    	return result;
    }

	
}
