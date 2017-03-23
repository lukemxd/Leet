package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {
	
    public static List<Integer> spiralOrder(int[][] matrix) {
    	if(matrix == null || matrix.length == 0) return Collections.emptyList();
    	final int[][] SHIFT = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    	List<Integer> result = new ArrayList<>();
    	int x = 0, y = 0, dir = 0;
    	for(int i = 0; i < matrix.length * matrix[0].length; ++i){
    		result.add(matrix[x][y]);
    		matrix[x][y] = 0;
    		int nextX = x + SHIFT[dir][0];
    		int nextY = y + SHIFT[dir][1];
    		if(nextX < 0 || nextX >= matrix.length ||
    		   nextY < 0 || nextY >= matrix[0].length ||
    		   matrix[nextX][nextY] == 0){
    			//Change direction;
    			dir = (dir + 1) % 4;
    			nextX = x + SHIFT[dir][0];
        		nextY = y + SHIFT[dir][1];
    		}
    		x = nextX;
    		y = nextY;
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		System.out.println(spiralOrder(matrix));
	}

}
