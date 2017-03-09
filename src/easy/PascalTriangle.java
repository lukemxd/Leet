package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
    	if(numRows == 0)
    		return Collections.emptyList();
    	List<List<Integer>> pascal = new ArrayList<>(numRows);
    	for(int i = 0; i < numRows; ++i){
    		List<Integer> curRow = new ArrayList<>();
    		for(int j = 0; j <= i; ++j){
    			curRow.add(j == 0 || j == i ? 1 : pascal.get(i - 1).get(j - 1)
    											  + pascal.get(i - 1).get(j));
    		}
    		pascal.add(curRow);
    	}
    	return pascal;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
