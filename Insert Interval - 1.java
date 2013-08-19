/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(intervals.size() == 0) {
            intervals.add(newInterval);
            return(intervals);
        }
        Collections.sort(intervals,Order);
        
        int start = newInterval.start;
        int end = newInterval.end;
        
        int remove = -1;
        int i;
        
        for( i = 0 ; i < intervals.size(); i++) {
            Interval temp =  intervals.get(i);
            
            if(end < temp.start) {
                if(remove == -1) {
                    remove = i;  // 
                }

                 break;
               
            } else {
                if(start >temp.end ) {
                    continue;
                } else {
                    start = Math.min(start,temp.start );
                    end = Math.max(end, temp.end);
                    if(remove == -1) {
                        remove = i;
                    }
                    
                }
            } 
            
        }
        
        
         if(remove != -1) {
                intervals.subList(remove, i).clear();
                intervals.add(remove, new Interval(start, end));
            } else {
                
                intervals.add(i, new Interval(start, end)); // 注意插入的位置。如果没有remove, 则在当时退出的地方插入
            }
        return(intervals);
        
        
    }
    
        public static final Comparator <Interval> Order =  new Comparator<Interval>() {
      //  @override
        public int compare( Interval o1, Interval o2) {
            if(o1.start > o2.start) {
                return(1);
            } else if(o1.start < o2.start) {
                return(-1);
            } else {
                return(0);
            }
        }
    };
}