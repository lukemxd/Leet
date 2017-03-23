package medium;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	

	public static String largestNumber(int[] nums){
		if(nums == null || nums.length == 0) return "";
		String[] strs = new String[nums.length];
		for(int i = 0; i < nums.length; ++i){
			strs[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String a, String b){
				String num1 = a + b;
				String num2 = b + a;
				return num2.compareTo(num1);
			}
		});
		if(strs[0].charAt(0) == '0') return "0";
		StringBuilder sb = new StringBuilder();
		for(String str : strs) sb.append(str);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{3, 30, 34, 5, 9};
		System.out.print(largestNumber(nums));
	}

}
