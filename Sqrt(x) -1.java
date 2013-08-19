public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x <=1) {
        return(x);
        }  
   
        
        long start = 0;      // ��Ҫ��long�Ͳ��ܱ��� mid*mid��ʱ�򳬳�int��Χ
        long end = x;
        long mid = (end+start)/2;

        
        while(end >= start ) {   // ������>= ����ȡ���м�ֵ
            long sqr =  mid* mid;
          
            if(sqr == x) {
                return((int)mid);
            }
            
            if(sqr > x) {
                end = mid-1;    // ע����Ҫ+ - 1���ܱ�����ѭ��
            } else {
                start = mid+1; 
            }
            mid =(start + end) /2 ;

        }
        
        return((int)mid);
    }
}