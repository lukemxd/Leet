package medium;

public class NumOfIslands {
	
	private static void clearIsland(char[][] grid, int row, int col){
		if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != '1')
			return;
		grid[row][col] = '0';
		clearIsland(grid, row + 1, col);
		clearIsland(grid, row - 1, col);
		clearIsland(grid, row, col + 1);
		clearIsland(grid, row, col - 1);
	}
	
    public static int numIslands(char[][] grid) {
    	if(grid == null || grid.length == 0)
    		return 0;
    	int count = 0;
    	for(int row = 0; row < grid.length; ++row){
    		for(int col = 0; col < grid[0].length; ++col){
    			if(grid[row][col] == '1'){
    				count++;
    				clearIsland(grid, row, col);
    			}
    		}
    	}
    	return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		System.out.println(numIslands(grid));
	}

}
