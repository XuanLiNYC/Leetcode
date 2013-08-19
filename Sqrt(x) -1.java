public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x <=1) {
        return(x);
        }  
   
        
        long start = 0;      // 需要是long型才能避免 mid*mid的时候超出int范围
        long end = x;
        long mid = (end+start)/2;

        
        while(end >= start ) {   // 必须是>= 才能取到中间值
            long sqr =  mid* mid;
          
            if(sqr == x) {
                return((int)mid);
            }
            
            if(sqr > x) {
                end = mid-1;    // 注意需要+ - 1才能避免死循环
            } else {
                start = mid+1; 
            }
            mid =(start + end) /2 ;

        }
        
        return((int)mid);
    }
}