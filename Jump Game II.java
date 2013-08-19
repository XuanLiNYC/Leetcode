public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length <= 1){
            return(0);
        } else if (A == null ){
            return(0);
        }
        
        int max = 0;
        int temp = 0;
        int num = 1;
        for(int i = 0 ; i <= max && i< A.length ; i ++) {  // 注意初始条件
            if(i+ A[i] >= A.length -1) {
                return(num);
            } else {
                if(i+A[i] > max) {
                    if(i+A[i] > temp) {
                        temp = i+A[i];
                    }
                }
            }
            
            if(i == max) {
                max = temp; 
                num++;
            }
            
        }
        
        return(num);
        
        
    }
}