public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
       if(A.length ==1){
       return (true);
       } else if((A.length == 0 ) || (A == null) ) {
           return(false);
       }
       
       int max = A[0];
       for(int i = 0 ; i <= max && i < A.length ; i ++ ) {
           if(i+A[i]>= A.length -1) {
               return(true);
           } else {
              if( i+ A[i] > max) {
                  max = i + A[i];
                  if(max >= A.length -1){
                      return(true);
                  }
              }
           }
       }
       return(false);
    }
}