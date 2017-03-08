package easy;

public class RomanToInt {

	public int romanToInt(String s) {
		if(s == null || s.length() == 0)
			return 0;
		int[] values = new int[s.length()];
		for(int i = 0; i < s.length(); ++i){
			switch (s.charAt(i)) {
			case 'M':
				values[i]=1000;
                break;
            case 'D':
            	values[i]=500;
                break;
            case 'C':
            	values[i]=100;
                break;
            case 'L':
            	values[i]=50;
                break;
            case 'X' :
            	values[i]=10;
                break;
            case 'V':
            	values[i]=5;
                break;
            case 'I':
            	values[i]=1;
                break;
			}
		}
		int sum = 0;
		for(int i = 0; i < values.length - 1; ++i){
			if(values[i] < values[i + 1])
				sum -= values[i];
			else
				sum += values[i];
		}
		return sum + values[values.length - 1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
