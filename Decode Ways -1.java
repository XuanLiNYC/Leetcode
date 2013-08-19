public class Solution {
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] h = new int[2];
        h[0] = 1;
        h[1] = 1;
        int sum = 0;
        if(s.length() <= 0) {
            return(0);
        }
        
        char[] array = s.toCharArray();
        for(int i = 0 ; i < s.length(); i++) {
            int temp = 0;
            if(i != 0) {
                if(array[i] <= '9' && array[i] >= '1') {
                    temp += h[1];
                } 
                
                int mid =  Integer.parseInt(s.substring(i-1,i+1));  // 注意这里的写法
                if(mid <= 26 && mid >= 10) {
                    temp += h[0]; 
                }
                
            } else {
                if(array[i] <= '9' && array[i] >= '1') {
                    temp += h[1];
                }
                
            }
            
            h[0] = h[1];
            h[1] = temp;             
        }
        
        return(h[1]);
    }
}