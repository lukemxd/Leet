package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	
	public static class Interval {
	    int start;
	    int end;
	    Interval() { start = 0; end = 0; }
	    Interval(int s, int e) { start = s; end = e; }
	}
	
    public static List<Interval> merge(List<Interval> intervals) {
    	if(intervals == null || intervals.size() == 0) 
    		return Collections.emptyList();
    	Collections.sort(intervals, new Comparator<Interval>() {
    		@Override
    		public int compare(Interval inter1, Interval inter2){
    			return Integer.compare(inter1.start, inter2.start);
    		}
		});
    	List<Interval> result = new ArrayList<>();
    	Interval current = intervals.get(0);
    	for(int i = 1; i < intervals.size(); ++i){
    		if(intervals.get(i).start <= current.end){
    			if(intervals.get(i).end > current.end)
    				current.end = intervals.get(i).end;
    		}
    		else{
				result.add(current);
				current = intervals.get(i);
			}
    	}
    	result.add(current);
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(15, 18));
		List<Interval> result = merge(intervals);
		for(Interval inter : result)
			System.out.println(inter.start + " " + inter.end);
	}

}
