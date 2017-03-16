package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctSubsets {
	
	private static void backTracking(List<List<Integer>> result, List<Integer> temp, int[] nums, int index){
		result.add(new ArrayList<>(temp));
		for(int i = index; i < nums.length; ++i){
			temp.add(nums[i]);
			backTracking(result, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
	}
	
    public static List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	//Arrays.sort(nums); //Call if duplicates exist in the array
    	backTracking(result, new ArrayList<>(), nums, 0);
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{3, 2, 4, 1};
		List<List<Integer>> result = subsets(input);
		for(List<Integer> l : result){
			for(Integer in : l)
				System.out.print(in + " ");
			System.out.println();
		}
			
	}

}
