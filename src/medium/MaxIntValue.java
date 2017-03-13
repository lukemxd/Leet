package medium;

import java.util.Arrays;
import java.util.Comparator;

public class MaxIntValue {
	

	public static void maxIntValue2(String[] values){
		Arrays.sort(values, new Comparator<String>() {
			@Override
			public int compare(String a, String b){
				String num1 = a + b;
				String num2 = b + a;
				return num2.compareTo(num1);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values = new String[]{"601", "609", "60"};
		maxIntValue2(values);
		System.out.print(Arrays.toString(values));
	}

}
