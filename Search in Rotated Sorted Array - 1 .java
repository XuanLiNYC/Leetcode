public class Solution {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = A.length;
        
        if(length == 0) {
            return(-1);
        } else {
            
           return (partialSearch(A, target, 0, length-1));
        }
        
    }
    
    public int partialSearch(int[] A, int target, int start, int end) {
        if(start > end) {
            return(-1);
        }
        
        int mid = (start + end)/2 ;
        if(A[mid] == target) {
            return(mid);
        } 
        
        
        
        if (A[start] <= A[mid]){
            if(target >= A[start] && target <= A[mid]) {               
                 return (partialSearch(A, target, start, mid));
            } else {
                
               return (partialSearch(A, target, mid+1, end));    
            }
        
        } else {
            if(target >= A[mid+1] && target <= A[end]) {               
                 return (partialSearch(A, target, mid+1, end));
            } else {
                
               return (partialSearch(A, target, start, mid));    
            }
            
        }
        
       
        
    }
}