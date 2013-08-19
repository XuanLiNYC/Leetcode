public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
     int p0 = 0 ;
     int p2 = A.length-1;
     
     for(int i = p0; i <= p2 ; i ++){
         if(A[i] == 0){
             if(i != p0){
            swap(A, i , p0);
            i--;  
             }
              p0++;

        } else if(A[i] == 1) {
            
        } else if(A[i] == 2) {
            swap(A, i , p2);
            p2 --;
            i--;
        }
         
     }
        
     
    }
    
    public void swap(int[] A, int i , int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}