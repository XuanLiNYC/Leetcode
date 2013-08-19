public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>>  list = new ArrayList<ArrayList<String>> ();
        ArrayList<String>  templist = new  ArrayList<String>();
         if(s.length() == 0) {
             return(list);
         }    
         
         getPartition(list,s, templist);
         return(list);
    }
    
    public void getPartition( ArrayList<ArrayList<String>>  list,String s, ArrayList<String>  templist) {
        if(s.length() == 0) {

            list.add(templist);
            return;                

        }
        
        for(int i = 1 ; i <= s.length() ;i ++) {
            String temps = s.substring(0,i);
            if(isPalindrome(temps)) {
             ArrayList<String>  newtemplist = new ArrayList<String> (templist) ;
             newtemplist.add(temps);
             getPartition(list, s.substring(i,s.length()),newtemplist);
            }

        }
        
    }
    
    public boolean isPalindrome(String s) {
        if(s.length() == 1) {
            return(true);
            
        }
        if(s.length() == 0) {
            return(false);
            
        }
        
        int length = s.length();
        char[] a  = s.toCharArray();
        for(int i = 0 ; i<=  length /2 ;i++ ) {
            if(a[i] == a[length -1 -i]) {
                continue;
            } else {
                return(false);
            }
        }
        
        return(true);
    }
    
}