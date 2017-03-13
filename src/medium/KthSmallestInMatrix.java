package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestInMatrix {

    public static int kthSmallest(int[][] matrix, int k) {
    	int size = matrix.length * matrix.length;
    	int result = 0;
    	if(k > size / 2){
    		PriorityQueue<Integer> minHeap = new PriorityQueue<>(size - k + 1);
        	for(int row = matrix.length - 1; row >= 0; --row){
        		for(int col = matrix.length - 1; col >= 0; --col){
        			if(minHeap.size() >= size - k + 1){
        				if(matrix[row][col] > minHeap.peek()){
        					minHeap.poll();
        					minHeap.add(matrix[row][col]);
        				}
        			}else minHeap.add(matrix[row][col]);
        		}
        	}	
        	result = minHeap.peek();
    	}else{
    		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        	for(int row = 0; row < matrix.length; ++row){
        		for(int col = 0; col < matrix.length; ++col){
        			if(maxHeap.size() >= k){
        				if(matrix[row][col] < maxHeap.peek()){
        					maxHeap.poll();
        					maxHeap.add(matrix[row][col]);
        				}
        			}else maxHeap.add(matrix[row][col]);
        		}
        	}
        	result = maxHeap.peek();
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][]{{1,5,9},{10,11,13},{12,13,15}};
		System.out.println(kthSmallest(matrix, 2));
	}

}
