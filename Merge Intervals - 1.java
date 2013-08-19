/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(intervals.size() <= 1) {
            return (intervals);
        }
        
        Collections.sort(intervals, Order);
        
        ArrayList<Interval> save = new ArrayList<Interval>();
        
        int start = -1;
        int end = -1;
        
        for(int i = 0; i < intervals.size() ;i ++){
            Interval temp = intervals.get(i);
            
            if(start == -1 && end == -1) {
                start = temp.start;
                end = temp.end;
                continue;
            }
            if(temp.start <= end) {
                end = Math.max(end, temp.end);
            } else {
                save.add(new Interval(start, end));
                start = temp.start;
                end = temp.end;
            }
        }
         save.add(new Interval(start, end));
         return(save);
        
        
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