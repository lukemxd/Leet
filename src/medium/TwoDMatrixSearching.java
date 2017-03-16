package medium;

public class TwoDMatrixSearching {

    public static boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
    	int row = 0, col = matrix[0].length - 1;
    	while(row < matrix.length && col >= 0){
    		if(matrix[row][col] == target) return true;
    		else if(matrix[row][col] > target) col--;
    		else row++;
    	}
    	return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = 
				new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
				//new int[][]{{1, 1}};
		System.out.println(searchMatrix(matrix, 15));
	}

}
