public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
     if(digits.length() == 0) {
         list.add("");
        return(list);
     }  
     
     char[] array = digits.toCharArray();
     int length = digits.length();
     char[] result = new char[length];
     letter(array,result, 0, list);
     return(list);
    }
    
    public boolean letter(char[] array, char[] result, int start, ArrayList<String> list) {
        if(start == array.length) {
            list.add( new String(result));
            return (true);
        }
        
        int digi = array[start]-'0';
        String add = check(digi) ;
        
        for(int i = 0; i< add.length() ; i++) {
            char[] newresult = new char[array.length];
            for(int j = 0; j< start ;j++) {
                newresult[j] = result[j];
            }
            newresult[start] = add.charAt(i);
            letter(array, newresult, start+1, list);     
        }
        return (true);
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