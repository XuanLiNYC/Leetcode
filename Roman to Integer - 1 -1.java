public class Solution {
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
      int pre = -1;
      int cur = 0;
      int sign = -1;
      int value = 0;
      
      for(int i = length -1; i >= 0 ; i--) {
          char cc = s.charAt(i);
          if(map.containsKey(cc)) {
              cur = map.get(cc);
              if(pre == -1) {
                  value += cur;
              } else {
                  if(pre > cur) {
                      value += cur*sign;
                  } else {
                      value += cur;
                  }               
              }
            pre = cur;
              
          }

      }
      
       
        return(value);
        
    }
}