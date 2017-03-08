package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {
		List<String> results = new ArrayList<>();
		for(int i = 1; i <= n; ++i){
			if(i % 3 == 0 && i % 5 != 0)
				results.add("Fizz");
			else if(i % 5 == 0 && i % 3 != 0)
				results.add("Buzz");
			else if(i % 15 == 0)
				results.add("FizzBuzz");
			else
				results.add(String.valueOf(i));
		}
		
		return results;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> result = fizzBuzz(50);
		System.out.print(result);
	}

}
