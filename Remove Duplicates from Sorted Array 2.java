public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int tag = 0;
        
        if(A.length <= 2) {
            return(A.length);
        }
        
        int j = 1;
        for(int i = 1; i< A.length ; i++ ){
            if(A[i] == A[ i-1]) {
                if(tag == 0) {  
                     A[j] = A[i]; 
                    j++;
                } 
                
                 tag ++;
            } else {
                A[j] = A[i];   
                tag = 0;
                j++;
                
            }
            
        }
        return(j);
    }
}