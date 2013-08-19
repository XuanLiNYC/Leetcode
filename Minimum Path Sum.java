public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
         int row = grid.length;
         int column = grid[0].length;
         int[][] record = new int[row][column];
         
        return( check(grid, row-1, column-1, record));
         
    }
    
    public int check(int[][] grid, int m, int n, int[][] record) {
        if(record[m][n] !=0 ){
            return(record[m][n]);
        }
        if((m == 0) && (n == 0) ){
            record[m][n]= grid[m][n];
            return(record[m][n]);
        }
        if( m == 0 ){
            
            record[m][n]= grid[m][n] + check(grid, m, n-1, record);
            return(record[m][n]);
        }
        
         if( n == 0 ){
            
            record[m][n]= grid[m][n] + check(grid, m-1, n, record);
            return(record[m][n]);
        }
        
        record[m][n]= Math.min( check(grid, m-1, n, record), check(grid, m, n-1, record)) + grid[m][n] ;
        return(record[m][n]);
        
    }
}