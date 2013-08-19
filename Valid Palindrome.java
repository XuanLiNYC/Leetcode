public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = 0;
        int end = s.length() -1;
        s=s.toLowerCase();
        while(start < end){
            char ss = s.charAt(start);
            char ee = s.charAt(end);
            if((ss >='a' && ss<= 'z' ) ||(ss >= '0' && ss <='9' )){
                
            } else {
                 
                start++;
                continue;               
            }
            
             if((ee >='a' && ee<= 'z' ) || (ee >= '0' && ee <='9' )){
                
            } else {
                end --;
                continue;
            }
            
            if(ss == ee){
                start++;
                end --;
                continue;
            } else {
                return(false);
            }

        }
        return(true);
    }
}