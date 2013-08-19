public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] save = new int[100];
        int result = fabi(n,save);
        return(result);

    }
    
    public int fabi(int n,int[] save){
        if(save[n] != 0){
            return(save[n]);
        }
        if(n == 1){
            save[n] = 1;
            return(1);
        } else if(n == 2){
            save[n] = 2;
            return(2);            
        } else {
            save[n] = fabi(n-1,save)+fabi(n-2,save);
            return(save[n]);
        }
        
    }
}