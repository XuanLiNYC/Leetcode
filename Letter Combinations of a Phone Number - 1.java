public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list =  new ArrayList<String> ();

         ArrayList<StringBuffer> sbrlist =  new ArrayList<StringBuffer> ();
        sbrlist.add(new StringBuffer(""));
        
         if(digits.length() == 0) {
            list.add(new String(sbrlist.get(0))); 
            return(list);
        }
        
        for(int i = 0 ; i < digits.length(); i++) {
            String s = check((int)digits.charAt(i)-'0');
            int size = sbrlist.size();
            
            for(int m = 0 ; m < size; m++) {
                 for(int j = 0 ;j< s.length() ;j++ ) {
                
                      StringBuffer newsbr = new StringBuffer(sbrlist.get(m));
                      newsbr.append(s.charAt(j));
                      sbrlist.add(newsbr);
                 }                
                
            }
            sbrlist.subList(0,size).clear();

        }
        
        for(int i = 0 ; i < sbrlist.size() ;i++) {
            list.add(new String(sbrlist.get(i)));
        }
        
        return(list);
        
        
    }
    
        public String check (int digit) {
        
        String[] sublist = {" ", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if( (digit >= 0) && (digit <= 9) ) {
            
                 return(sublist[digit]);
        } else {
            
            return ("");
        }
   
    }
}