package medium;

public class RotateImage {
	
    public static void rotate(int[][] matrix) {
    	if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
    		return;
    	//Upside down
    	for(int i = 0; i < matrix.length / 2; ++i){
    		int[] temp = matrix[i];
    		matrix[i] = matrix[matrix.length - 1 - i];
    		matrix[matrix.length - 1 - i] = temp;
    	}
    	//Symmetry swap
    	for(int j = 0; j < matrix[0].length - 1; ++j){
    		for(int k = j + 1; k < matrix[0].length; ++k){
    			int temp = matrix[j][k];
    			matrix[j][k] = matrix[k][j];
    			matrix[k][j] = temp;
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		rotate(matrix);
	}

}
