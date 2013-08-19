public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        
         int[][] save = new int[row][column];
         for(int i = 0 ; i < row; i++) {
             for(int j = 0 ; j < column; j++){
                 save[i][j] = -1;
             }
         }
        if(obstacleGrid[0][0] == 1){
        return(0);
        } 
        
        if(obstacleGrid[row-1][column-1] == 1){
            return(0);
        }
         
        int result = check(save, obstacleGrid, 0, 0);
     
        return(result);
    }
    
    public int check(int[][] save, int[][] obstacleGrid, int r, int c ){
        int row = obstacleGrid.length-1;
        int column = obstacleGrid[0].length-1;
        
        if(r > row || c > column ){
            return(0);
        }
        
        if(save[r][c] != -1){
            return(save[r][c]);
        }
        
        if(obstacleGrid[r][c] == 1){
            save[r][c] = 0;
            return(0);
        }
        
        if(r == row && c == column){
            if(obstacleGrid[r][c] == 0){
                save[r][c] = 1;
            } else {   
                save[r][c] = 0; 
            }
            return(save[r][c]);  // 这里开始忘记了，结果就错了，一定要记得每次赋值之后都返回结果
        }
        
        
        save[r][c] = check(save,obstacleGrid, r+1, c )+ check(save,obstacleGrid, r, c+1 );
        return(save[r][c] );
        
    }
}