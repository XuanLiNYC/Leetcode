public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
    int length = m+n;
        for(int i = length -1; i >=0; i--){
            if(n-1 < 0){
                break;
            } else if(m-1 <0){
               A[i] = B[n-1];
                n--; 
            } else if(A[m-1] >= B[n-1]){
                A[i] = A[m-1];
                m--;
            } else {
                A[i] = B[n-1];
                n--;
            }
        }
        
    }
}