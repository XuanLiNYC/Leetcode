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
                if( m == -1){   //ע�⣬���￪ʼд���ˣ������ж�m�Ƿ���ֵ�ˣ���������mֵ������ǰ���Ѿ���ֵ��
                   m = i; 
                }

                start = Math.min(ins, start);
                end = Math.max(ine, end);
                if(end == ine ) {
                    me = i+1;   // ע��������me =i+1����Ϊ����remove��ʱ���ǲ�����meֵ�ġ�
                  continue; 
                } else {
                   continue; 
                }
                
            }
        }
        
                

        
        if(m != -1){
            
       // intervals.removeRange(m,me);       
       intervals.subList(m, me).clear();  // ���Ҫ����ע�⣬���������������Чremove, �����˵ɶ��������������
        } else {
                m = me;
        }
    

        Interval it = new Interval(start, end);
        intervals.add(m, it);
        
        return(intervals);

        
    }
}