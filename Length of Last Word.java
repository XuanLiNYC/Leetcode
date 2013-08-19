public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = -1;
        int end = -1;
        
       for(int i = s.length()-1 ; i >= 0; i--){
            if(s.charAt(i) != ' '){
                if(start == -1){
                    start = i;
                }
            }
            if(s.charAt(i) == ' '){
                if(start != -1){
                    end = i;
                    break;
                } 
            }
       } 
       
       if(start != -1){
           return(start -end);
       } else {
           return(0);
       }
    }
}