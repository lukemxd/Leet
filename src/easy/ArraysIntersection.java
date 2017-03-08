package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysIntersection {

	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> table = new HashMap<>();
		List<Integer> resultList = new ArrayList<>();
		for(int i = 0; i < nums1.length; ++i){
			if(table.containsKey(nums1[i]))
				table.put(nums1[i], table.get(nums1[i]) + 1);
			else
				table.put(nums1[i], 1);
		}
		
		for(int j = 0; j < nums2.length; ++j){
			if(table.containsKey(nums2[j])){
				table.put(nums2[j], table.get(nums2[j]) - 1);
				resultList.add(nums2[j]);
				if(table.get(nums2[j]) == 0)
					table.remove(nums2[j]);
			}
		}
		
		int[] result = new int[resultList.size()];
		for(int k = 0; k < resultList.size(); ++k)
			result[k] = resultList.get(k);
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 2};
		
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}

}
