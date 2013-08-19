public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(matrix.length == 0){
            return(list);    
        }
        
        int R = matrix.length;
        int C = matrix[0].length;

        
        int count = R*C;
        int circle = 0;
        
        while(count > 0){
            
            for(int i = circle ; i <= C-1-circle; i++ ) {
                list.add(matrix[circle][i]);
                count -- ;
                if(count == 0) {
                    return(list);
                }
            }
            
             for(int i = circle+1 ; i <= R-1-circle; i++ ) {
                list.add(matrix[i][C-1-circle]);
                count -- ;
               if(count == 0) {
                    return(list);
                }
            }
            
              for(int i = C-1-circle-1 ; i >= circle; i-- ) {
                list.add(matrix[R-1-circle][i]);
                count -- ;
                if(count == 0) {
                    return(list);
                }
            }
            
            for(int i = R-1-circle-1 ; i > circle; i-- ) {
                list.add(matrix[i][circle]);
                count -- ;
               if(count == 0) {
                    return(list);
                }
            }
            
            circle++;
            
        }
        
        return(list);
    }
}