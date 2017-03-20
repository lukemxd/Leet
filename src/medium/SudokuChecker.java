package medium;

import java.util.Arrays;

public class SudokuChecker {
	
	private static boolean hasDuplicate(char[][] board, int startRow, int endRow, int startCol, int endCol){
		boolean[] flags = new boolean[board.length + 1];
		Arrays.fill(flags, false);
		for(int i = startRow; i < endRow; ++i){
			for(int j = startCol; j < endCol; ++j){
				if(board[i][j] != '.'){
					int num = board[i][j] - '0';
					if(flags[num]) return true;
					flags[num] = true;
				}
			}
		}
		return false;
	}
	
    public static boolean isValidSudoku(char[][] board) {
    	if(board == null || board.length != 9 || board[0].length != 9)
    		return false;
		//Check rows
		for(int row = 0; row < board.length; ++row){
			if(hasDuplicate(board, row, row + 1, 0, board[0].length))
				return false;
		}
		//Check columns
		for(int col = 0; col < board[0].length; ++col){
			if(hasDuplicate(board, 0, board.length, col, col + 1))
				return false;
		}
		//Check regions
		int regionSize = (int)Math.sqrt(board.length);
		for(int regRow = 0; regRow < regionSize; ++regRow){
			for(int regCol = 0; regCol < regionSize; ++regCol){
				if(hasDuplicate(board, regRow * regionSize, (regRow + 1) * regionSize, 
								regCol * regionSize, (regCol + 1) * regionSize))
					return false;
			}
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, 
									  {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, 
									  {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, 
									  {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, 
									  {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, 
									  {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, 
									  {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, 
									  {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, 
									  {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
		System.out.println(isValidSudoku(board));
	}

}
