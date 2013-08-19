public class Solution {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
       int[][] savepath = new int[m+n][m] ;
      int result = checkpath(m-1, n-1, savepath);
      return(result);
    }
    
    public int checkpath( int m, int n, int[][] savepath) {
        if (savepath[m+n][m] !=0) {
            return(savepath[m+n][m]);
        }
        
        if(m == 0 ) {
            savepath[m+n][m] = 1;
            return (1);
        }
        
        if( n == 0) {
            savepath[m+n][m] =1;
            return (1);
        }
        
        
        int result = 0;
        result = checkpath(m-1, n,savepath ) + checkpath(m, n-1, savepath);
        savepath[m+n][m] = result;
        return(result);
    }
}