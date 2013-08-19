public class Solution {
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = s.length();
        char[] array = s.toCharArray();
        String sub =s;
        
        int max = 1;

    
        for(int  i =length /2; i >=0; i--) {
            int[] templ = check(array,i);
            int[] tempr = check(array, length-1-i);
          
            if(templ[1]-templ[0]+1 > max) {
                max = templ[1]-templ[0]+1;
                sub= s.substring(templ[0], templ[1]+1);
            }
            
            if(tempr[1]-tempr[0]+1 > max) {
                max = tempr[1]-tempr[0]+1;
                sub= s.substring(tempr[0], tempr[1]+1);
            }
            
            if(i *2 < max) {
                break;
            }
            
        }
        
        return(sub);
    }
    
    public int[] check(char[] array, int i) {
        int start = i ;
        int end = i;
        int temp = 0;
        int max = 0;
        int[] result = new int[2];
        result[0]=i;
        result[1]=i;
        while( (start >= 0) && (end < array.length) &&(array[start] == array[end ])) {
         temp = end - start +1;
         start --;
         end ++;
        }
        if(temp > max) {
            max = temp;
            result[0]=start+1;
            result[1]=end-1;
        }
        start =i-1;
        end = i;
        temp = 0;
        while( (start >= 0) && (end < array.length) &&(array[start] == array[end ])) {
         temp = end - start +1;
         start --;
         end ++;
        }
        
        if(temp > max) {
            max = temp;
            result[0]=start+1;
            result[1]=end-1;
        }
        
        return(result);
        
        
    }
}