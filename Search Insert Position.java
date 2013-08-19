public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if((A.length == 0) || (A == null) ) {
            return(0);
        }
        int start = -1;
        int end = 0;
        
        for(int i = 0 ; i < A.length ; i++) {
            if(A[i] == target) {
                return(i);
            }
            
            if(A[i]< target) {
                start = i;
            }
            if(A[i] > target) {
                end = i;
                break;
            }
        }
        
        if(start == A.length-1 ){
            return(start +1);
        }
        else {
            return(end);
        }
    }
}