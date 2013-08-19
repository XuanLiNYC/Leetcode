public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x < 0) {
            return(false);
        }
        
        int step = 1;
        int m = x;
        while( m >= 10) {  // ע��������>= ����10���ڵĻ�������
            m = m/10;
            step *= 10;
        }
        
        m = x;
        while(step >1 ) {
            if(m / step == m % 10){
                m = m % step;
                m = m /10;
                step = step /100;
            } else {
                return(false);
            }
        }
        return(true);
        
        
        
    }
}