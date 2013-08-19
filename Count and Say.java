public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n <=0) {
            return(new String());
        }
        String s ="1";
        while(n != 1 ){
            s= check(s);
            n--;
  
        }
        
        return(s);
    }
    
    public String check(String s) {
        StringBuffer sbr= new StringBuffer();
        int count = 1;
        char c = s.charAt(0);
        for(int i = 1 ; i < s.length(); i ++) {
            if(c == s.charAt(i)) {
                count ++; 
            } else {
                char t = (char) (count+'0');
                sbr.append(t);
                sbr.append(c);
                c=s.charAt(i);
                count = 1;
            
             }
        }
        
         char t = (char) (count+'0');
        
                sbr.append(t);
                sbr.append(c);
        
     

        
        return(new String(sbr));
    }
}