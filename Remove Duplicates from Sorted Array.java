public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
       if((A.length == 0) || (A.length == 1) ) {
           return (A.length);
       }
       int j = 1;
       for(int i = 1; i < A.length ; i++) {
           if(A[i]==A[i-1]) {
                            
           } else {
               A[j] = A[i] ;
               j++;
               
           }
       }
       
       return(j);
    }
}