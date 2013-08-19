public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(board.length % 3 != 0 ) {
            return(false);   
        }
        if(board.length != board[0].length) {
            return(false);
        }
        
        int row = board.length;
        int column = board[0].length ;
        
      
        
        for(int i = 0 ; i < row ; i ++) {
            int[] tempa = new int[10];
            int[] tempb = new int[10];
            for( int j = 0 ; j < row; j ++) {
                if(board[i][j] == '.') {
                    
                } else if ((board[i][j] != '.') &&(board[i][j] -'0' >= 0) && (board[i][j] -'0' <=9)) {
                     if(tempa[board[i][j] - '0'] != 0) {
                         return(false);
                     } else {
                          tempa[board[i][j]- '0'] = 1; 
                     }
                    
                } else {
                    return (false);
                }
                  
                 if(board[j][i] == '.') {
                    
                } else if((board[j][i] != '.') && (board[j][i]-'0' >= 0) && (board[j][i] - '0' <= 9)) {
                     if(tempb[board[j][i] -'0'] != 0) {
                         return(false);
                     } else {
                          tempb[board[j][i]-'0'] = 1; 
                     }
                    
                }  else {
                    return (false);
                }
               
            }
  
        }
        
        for( int i = 0 ; i < row/3 ; i ++ ) {
            for(int j = 0 ; j < row /3 ; j ++) {
                boolean result = check(board, i*3 , j*3 );
                if(!result) {
                    return(false);
                }
            }
        }
        return(true);
    }
    
    public boolean check(char[][] board, int i , int j) {
        int[] temp = new int[10];
        for(int a = i ; a < i +3; a++) {
            for(int b = j ; b < j + 3; b++) {
                if(board[a][b] == '.') {
                    
                } else if ((board[a][b] != '.') &&(board[a][b] -'0' >=0) && (board[a][b] -'0' <=9)) {
                    if(temp[board[a][b]-'0'] != 0){
                        return (false);
                    } else {
                        temp[board[a][b]-'0'] =1;
                    }
                } else {
                    return(false);
                }
                
            }
        }
        return(true);
        
    }
}