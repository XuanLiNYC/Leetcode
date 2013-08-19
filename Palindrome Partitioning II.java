public class Solution {
    public int minCut(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if ((s == null) || (s.length() == 1)) {
            
            return (0);
        }
        
        int length = s.length();
        int result = cut(s, 0, length-1 );
        
        return(result);
    }
    
    public int cut(String s, int start, int end) {
        
        int min = -1;
        int result = 0;
        if( start == end ){
            return (0);
        } else if (palindrom(s, start, end)){
            return (0);          
        } else {
            
            for (int i = start ; i < end; i++) {
               
               result = cut(s, start, i) + 1 + cut(s, i+1, end);
               if(min == -1) {
                   min = result;
               } else if (min > result) {
                   
                   min = result ;
               }
                
            }
            return (min);
        }
        
    }
   
   public boolean palindrom(String s, int start, int end) {
       
      if (start == end) {
          
          return (true);
      }
      
      int tag = (end - start +1) %2 ;
      int i=0;
      int j=0;
      if(tag == 0) {
          i = ( end + start +1) /2;
          j = i -1 ;
      } else {
          
          i = ( end + start ) /2;
          j = i;
      }
      boolean result = false;
      while (( i <= end )&& (j>= start)) {
           
          if(s.charAt(i) != s.charAt(j)) {
              
             return (false) ;
          }
          i++;
          j--;
      }
      
      return(true);
   }
}