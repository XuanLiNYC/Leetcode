public class Solution {
    public int numDistinct(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list  = new ArrayList<String>();
        StringBuffer sbr = new StringBuffer();
        check(S,T,0,0,list,sbr);
        return(list.size());
    }
    
    public void check(String S, String T, int m, int n, ArrayList<String>  list, StringBuffer sbr){

        
         if( n>= T.length()){
             list.add(new String(sbr));
             return;
         }
         
        if(m >= S.length() ){
             return;
        }
        
        if(S.length() - m < T.length() -n) {
            return;
        }
           
       
        
            
            if (S.charAt(m) == T.charAt(n)) {
              StringBuffer newsbr = new StringBuffer(sbr);
              newsbr.append(S.charAt(m));
              check(S, T, m+1, n+1, list, newsbr);
              check(S, T, m+1, n, list, sbr);   
            } else {

                check(S, T, m+1, n, list, sbr);               
            }

        
    }
}