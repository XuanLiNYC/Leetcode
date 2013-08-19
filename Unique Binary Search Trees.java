public class Solution {
    public int numTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int result =check(n+1);
        return(result);
    }
    
    public int check(int n){
        int[] save = new int[n];
        save[0] = 1;
        save[1] = 1;
        
        for(int i = 2 ; i < n; i++) {
            for(int j = 0 ; j < i ; j++) {
                save[i] += save[j] * save[i-j-1];
            }
        }
        
        return(save[n-1]);
    } 
}