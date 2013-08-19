public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
      
            
        int i = 0; 
        int j = 0;
        int length= A.length;
        
        while( j< length)
        {
            if ( A[j] != elem )  {
                if ( i!= j) {
                    
                   A[i]=A[j];   
                }
   
                i++;
                j++;
                
            } else  {
                j++ ;
            }
                  
        }
        
              return( i);
            
    }
}