package medium;

import java.util.PriorityQueue;

public class KthLargestInArray {
	
    public int findKthLargest(int[] nums, int k) {
    	if(nums == null || nums.length == 0 || nums.length < k)
    		return -1;
    	PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
    	for(int in : nums){
    		if(minHeap.size() < k) minHeap.add(in);
    		else{
    			Integer top = minHeap.peek();
    			if(in > top){
    				minHeap.poll();
    				minHeap.add(in);
    			}
    		}
    	}
    	return minHeap.poll();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
