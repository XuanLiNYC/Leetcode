public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long r = 0;
        int sign = 1;
        int m = x;
        if(x < 0) {
            sign = -1;
            m = m* -1;
        }
        
        while(m > 0) {
            r = r*10 + m%10;
            m = m/10;
        }
        
        r = r*sign;
        
        return((int)r);
    }
}