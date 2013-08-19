public class Solution {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
       int length = s.length();
       int cur = 0;
       int next = -1;
       int sign = -1;
       int value = 0;
       
       for(int i = 0 ; i < length -1; i++) {
           char cc = s.charAt(i);
           if( map.containsKey(cc) ) {
               cur = map.get(cc);
               int j =i+1; 
               while( j < length ){
                   char nn = s.charAt(j);
                   if(map.containsKey(nn)) {
                       next = map.get(nn);
                       if(cur < next) {
                           value += sign*cur;
                       } else {
                           value += cur;
                           
                       }
                       break;
                   }
                   j++;
               }
               
               
           }
           
       }
       
       char ff = s.charAt(length -1);
       if(map.containsKey(ff)) {
           int last = map.get(ff);
           value += last;
       }
       
        return(value);
        
    }
}