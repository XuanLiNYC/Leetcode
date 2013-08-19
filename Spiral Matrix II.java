public class Solution {
    public int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(n == 0) {
            int[][] temp = {};
            return(temp);
        }
        if(n*n == 1) {
            int[][] temp = {{1}};
            return(temp);
        }
        
        int count = n*n;
        int[][] save = new int[n][n];
        int circle =0;
        int start = 1;
        
        while(count >0) {
            for(int i = circle; i<= n-1-circle; i++ ) {
                save[circle][i] = start;
                start ++;
                count --;
            }
            
            if(count == 0) {
                return(save);
            }
            
            for(int i = 1+ circle; i <= n-1-circle; i ++) {
                save[i][n-1-circle] = start;
                start++;
                count--;
            }
            
             if(count == 0) {
                return(save);
            }
            
            for(int i = n-2- circle; i >= circle; i --) {
                save[n-1-circle][i] = start;
                start++;
                count--;
            }
            
             if(count == 0) {
                return(save);
            }
            
             for(int i = n-2- circle; i > circle; i --) {
                save[i][circle] = start;
                start++;
                count--;
            }
            
            if(count == 0) {
                return(save);
            }
            
            circle++;
        }
        
         return(save);
        
        
        
    }
}