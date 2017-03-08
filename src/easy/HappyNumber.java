package easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static boolean isHappy(int n) {
		Set<Integer> table = new HashSet<>();
		int sum;
		while(table.add(n)){
			sum = 0;
			while(n > 0){
				sum += (n % 10) * (n % 10);
				n = n / 10;
			}
			if(sum == 1)
				return true;
			else{
				n = sum;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}

}
