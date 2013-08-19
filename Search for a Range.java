public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int size = A.length ;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        
        int start = 0;
        int end = size-1;
        int mid = (start + end) /2;
        int p = -1;
        int q = -1;
        
        
        while(start <= end) {
            mid = (start + end) /2;
             if(A[mid] == target) {
                p = mid;
              start = mid+1;         
            } else if (A[mid] < target) {
                start = mid+1; 
            } else {
                end = mid -1;               
            }        
        }
        
        start = 0;
        end = end = size-1;
  
           while(start <= end) {
            mid = (start + end) /2;
             if(A[mid] == target) {
                q = mid;  
               end = mid -1;
            } else if (A[mid] < target) {
              start = mid+1;            
            } else {
            end = mid -1;      
            }        
        }
        
        result[0] = q;
        result[1] = p;
        
        return(result);
        
        
        
    }
    
  
}