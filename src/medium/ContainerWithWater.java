package medium;

public class ContainerWithWater {
	
    public static int maxArea(int[] height) {
    	int max = 0, left = 0, right = height.length - 1;
    	while(left < right){
    		max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
    		if(height[left] <= height[right]) left++;
    		else right--;
    	}
    	return max;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(maxArea(height));
	}

}
