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

        Collections.sort(intervals, ORDER);
        
      ArrayList<Interval> newlist =  check(intervals);
        
        return(newlist);
        
    }
    
        static final Comparator <Interval> ORDER= new Comparator<Interval>() {
        public  int compare(Interval i1, Interval i2){
            if(i1.start < i2.start){
                return(-1);
            } else if(i1.start > i2.start){
                return(1);
            } else {
                return(0);
            }
        }
        };
    
      public ArrayList<Interval>  check(ArrayList<Interval> intervals){
          ArrayList<Interval> newlist = new ArrayList<Interval>();
          int start = -1;
          int end =-1;
          int m = -1;
          int me = intervals.size();
          int size = intervals.size();
          for(int i = 0 ; i <size; i++) {
              Interval tempin = intervals.get(i);
              if(start == -1 && end == -1){
                  start = tempin.start;
                  end = tempin.end;
              } else {
                  if(tempin.start <= end) {
                      start = Math.min(start, tempin.start);
                      end = Math.max(end, tempin.end);
                  } else if(end < tempin.start){
                      Interval newin= new Interval(start,end);
                      newlist.add(newin);
                      start =tempin.start;
                      end = tempin.end;
                  }
                  
              }
          }
          
          if(start != -1 || end != -1){
              
              Interval newin= new Interval(start,end);
              newlist.add(newin);
          }
          return(newlist);
      }

}