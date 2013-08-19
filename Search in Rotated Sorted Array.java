public class Solution {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = A.length;
       int result = newsearch(A, target, 0,length-1 );
       return(result);
    }
    
    public int newsearch(int[] A, int target,int start, int end ) {
        if (end - start <= 1) {
            if(A[end] == target ){
                return(end);
            }
             if(A[start] == target) {
                 return(start);
             }
             
             return(-1);
        }
        
        int middle  = (end + start) /2; 
        if(A[middle] <= A[end]) {
            if (( A[middle] <= target ) && (A[end] >= target)) {
                return(newsearch(A, target, middle, end));
            } else {
                
                 return(newsearch(A, target, start, middle-1));
            }
        } else {
            if((A[start]<= target) &&(A[middle-1] >= target) ) {
                 return(newsearch(A, target, start, middle-1));            
            } else {
                
                return(newsearch(A, target, middle, end)); 
            }
            
            
        }
        
        
    }
}