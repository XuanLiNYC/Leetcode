public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int j = 0 ;  // ���û�и����Ļ���jӦ�ô�0 ��ʼ
        for(int i = 0 ; i < A.length; i++){
            if(A[i] <= 0){
                swap(A, i, j);
                j++;
            }
        }
        
        for(int i = j ; i < A.length; i++){
            int p = Math.abs(A[i])-1+j;
            if(p >= A.length || p < 0 ){  // ע��������жϣ�P����Խ��
                continue;
            } else {
                if(A[p] > 0){
                    A[p] *= -1;
                  }                
            }

        }
        
        int result =A.length  +1-j;   // ��û�еĻ��������������һ����
           for(int i = j ; i < A.length; i++){
               if(A[i] > 0) {
                  result = i +1 -j;   
                  return(result);
               } 
           }
           return(result);
        
    }
    
    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}