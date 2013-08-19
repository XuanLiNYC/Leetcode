public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int tag = 1;
        if(x < 0){
            
           tag = -1;
           x *= -1;
           
        }
        int result = 0;
        int MAX = Integer.MAX_VALUE ;
        int MIN = Integer.MIN_VALUE;
        
        while(x > 0) {
            if(( MAX / 10 - result) < x % 10 ) {
               if(tag == 1) {
                 result = MAX;   
               } else {
                   
                   result = MIN;
               }
              
                break;               
            }
            result = result * 10 + x % 10;
            x = x /10;
    
        }
        if ((tag == -1) && (result > 0)) {
            result *= -1;
        }
        return (result);
    }
}