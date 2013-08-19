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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = newInterval.start;
        int end = newInterval.end;
        int m = -1;
        int me =intervals.size();
        for(int i = 0 ; i < intervals.size(); i++){
            Interval in = intervals.get(i);
            int ins = in.start;
            int ine = in.end;
            
            if(ine< start){
                continue;
            } else if(ins > end){
                me = i;
                break;
            } else if(start <= ine){
                if( m == -1){   //注意，这里开始写错了，忘了判断m是否有值了，结果后面的m值覆盖了前面已经赋值的
                   m = i; 
                }

                start = Math.min(ins, start);
                end = Math.max(ine, end);
                if(end == ine ) {
                    me = i+1;   // 注意这里是me =i+1，因为往后remove的时候是不包括me值的。
                  continue; 
                } else {
                   continue; 
                }
                
            }
        }
        
                

        
        if(m != -1){
            
       // intervals.removeRange(m,me);       
       intervals.subList(m, me).clear();  // 这个要格外注意，用这个方法才能有效remove, 上面的说啥保护法，不让用
        } else {
                m = me;
        }
    

        Interval it = new Interval(start, end);
        intervals.add(m, it);
        
        return(intervals);

        
    }
}