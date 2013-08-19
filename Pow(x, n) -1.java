public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(n == 0) {
            return(1);
        }
 
        if(n< 0) {
            x = 1/x ;
            n = n * -1;
        }
        
        double result = 1;
        double step = x;
        
        while( n > 0) {
            if(n%2 == 1) {
                result *= step;
            }
            n = n/2;
            step *= step;
            
        }
        
        return(result);
    }
    
    
}