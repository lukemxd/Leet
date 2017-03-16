package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	private static void swap(int[] nums, int a, int b){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	private static void permuteHelper(List<List<Integer>> result, int[] nums, int index){
		if(index == nums.length - 1){
			List<Integer> line = new ArrayList<>();
			for(int in : nums)
				line.add(in);
			result.add(line);
			return;
		}
		for(int i = index; i < nums.length; ++i){
			swap(nums, i, index);
			permuteHelper(result, nums, index + 1);
			swap(nums, i, index);
		}
	}
	
	private static void permuteHelper2(List<List<Integer>> result, List<Integer> temp, int[] nums){
		if(temp.size() == nums.length){
			result.add(new ArrayList<>(temp));
			return;
		}
		for(int i = 0; i < nums.length; ++i){
			if(!temp.contains(nums[i])){
				temp.add(nums[i]);
				permuteHelper2(result, temp, nums);
				temp.remove(temp.size() - 1);	
			}	
		}
	}
	
    public static List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	//permuteHelper(result, nums, 0);
    	permuteHelper2(result, new ArrayList<>(), nums);
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1, 2, 3};
		List<List<Integer>> result = permute(nums);
		for(List<Integer> list : result){
			for(Integer in : list)
				System.out.print(in);
			System.out.println();
		}
			
	}

}
