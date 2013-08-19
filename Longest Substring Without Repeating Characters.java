import java.util.Hashtable;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() <=1){
            return(s.length());
        }
        
        Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
        int i = 0; 
        int max = 0;
        int temp = 0;
        while(i < s.length()) {
            char c=  s.charAt(i);
            if(table.containsKey(c)) {
                int value = table.get(c);
                if(max < temp) {
                    max = temp;
                } 
                temp = 0;
                i = value;
                table.clear();
            } else {
                temp ++;
                table.put(c, i);
            }
            i++;
            
        }
        
         if(max < temp) {
            max = temp;
         }
        return(max);
        
    }
}