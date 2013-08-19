public class Solution {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[][] M = new int[m][n];
        M[0][0] = 1;
        
        check(M, m-1,n-1);
        
        return(M[m-1][n-1]);
    }
    
    public int check(int[][] M, int i, int j) {
        if(i < 0 || j< 0 || i >M.length || j > M[0].length) {
            return(0);
        }
        if(M[i][j] == 0) {
            M[i][j] = check(M, i-1, j) + check(M,i, j-1);
            return(M[i][j]);
        } else {
            return(M[i][j]);
            
        }
    }
}