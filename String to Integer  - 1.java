public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(str.length() == 0) {
            
            return(0);
        }
            
        return(getValue(str));
    }
    
    public int getValue(String str) {
        str = str.trim();
        int sign = 1;
        char[] array = str.toCharArray();
        int start = 0;
        if(array[0] == '-') {
            sign = -1;
            start = 1;
        } else if( array[0] == '+') {
             sign = 1;
             start = 1;
            
        }
        int length = array.length;
        
        long value = 0;
        
        for(int i = start ; i < length; i ++) {
            if(array[i] > '9' || array[i] < '0') {
                break;
            }
            
            value = value * 10 +(int) (array[i]-'0');           
        }
        
        if(sign == 1) {
            if(value > Integer.MAX_VALUE) {
                return(Integer.MAX_VALUE);
            }            
        }
        
        if(sign == -1) {
            value = value *-1;
            if(value < Integer.MIN_VALUE) {
                return(Integer.MIN_VALUE);
            }
        }
        
        return((int)value);
      
        
    }
    
        
}