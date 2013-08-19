public class Solution {
    public boolean search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = A.length;
      boolean result = newsearch(A, target, 0,length-1 );
       return(result);
    }
    
    public boolean newsearch(int[] A, int target,int start, int end ) {
        if (end - start <= 1) {
            if(A[end] == target ){
                return(true);
            }
             if(A[start] == target) {
                 return(true);
             }
             
             return(false);
        }
        
        int middle  = (end + start) /2; 
        boolean r1 = false;
        boolean r2 = false;       
                r1= newsearch(A, target, start, middle -1); 
                r2 = newsearch(A, target, middle, end); 
                
                return(r1 || r2);
            
            
            
        }
        

}