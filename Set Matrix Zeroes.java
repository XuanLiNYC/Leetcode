public class Solution {
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int r = matrix.length;
        int c = matrix[0].length; 
        int i = 0 ; 
        int j = 0 ;
        int finishtag = 0;
        
        for( i = 0; i < r; i++) {
            for(j = 0 ; j < c; j++) {
                if(matrix[i][j] == 0) {
                    finishtag = 1;
                    break;
                }
                
            }
            if(finishtag == 1) {
                break;
            }
        }
        
        if(finishtag == 0) {
            return;
        }
        
        for(int m = 0 ; m < r; m++) {
            for(int n = 0 ; n < c; n++) {
                if(matrix[m][n] == 0) {
                    matrix[i][n] = 0;
                    matrix[m][j] = 0;
                }
            }
        }
        
        
        for(int m = 0 ; m < r; m++) {
             if(matrix[m][j] == 0) {
                 if(m != i) {
                     for(int n = 0 ; n < c; n++) {
                        matrix[m][n] = 0;   
                      }  
                 }
    
              }
        }
        
         for(int m = 0 ; m < c; m++) {
             if(matrix[i][m] == 0) {
                 if(m != j) {
                    for(int n = 0 ; n < r; n++) {                   
                        matrix[n][m] = 0;
                     }    
                 }
  
              }
        }
        
        
        for(int m = 0 ; m < r; m++) {
            matrix[m][j] = 0;
        }
        for(int n = 0 ; n < c; n++) {
            matrix[i][n] = 0;
        }
        
    
        
    }
}