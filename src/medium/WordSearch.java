package medium;

public class WordSearch {
	
	private static boolean existHelper(char[][] board, boolean[][] flags, String word, int row, int col, int index){
		if(index == word.length()) return true;
		if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || flags[row][col] || board[row][col] != word.charAt(index)) return false;
		flags[row][col] = true;
		if(existHelper(board, flags, word, row + 1, col, index + 1) ||
		   existHelper(board, flags, word, row - 1, col, index + 1) ||
		   existHelper(board, flags, word, row, col + 1, index + 1) ||
		   existHelper(board, flags, word, row, col - 1, index + 1))
				return true;
		flags[row][col] = false;
		return false;
	}
	
    public static boolean exist(char[][] board, String word) {
    	if(board == null) return false;
    	boolean[][] flags = new boolean[board.length][board[0].length];
    	for(int i = 0; i < board.length; ++i){
    		for(int j = 0; j < board[0].length; ++j){
    			if(existHelper(board, flags, word, i, j, 0))
    				return true;
        	}
    	}
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[][] board = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
		char[][] board = new char[][]{{'A', 'B'}};
		String word = "BA";
		System.out.println(exist(board, word));
	}

}
