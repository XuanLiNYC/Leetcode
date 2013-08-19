public class Solution {
    public int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int sum = A[0];
        int temp = A[0];
        
        for(int i = 1; i < A.length; i++) {
            if (temp < 0) {
                temp = A[i];
            } else {
                if((temp + A[i]) >0) {
                    temp += A[i];
                } else {
                    temp = A[i];
                }
                
            }
            
            if(sum < temp) {
                    sum = temp;
                }
        }
        
        return(sum);
    }
}