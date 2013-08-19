public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
        if(n <= 0) {
            return(list);
        }
        StringBuffer sbr =  new StringBuffer();
        getParenthsis(n, list, 0, 0, sbr);
        
        
        return(list);
    }
    
    public void getParenthsis(int n, ArrayList<String> list, int i, int j, StringBuffer sbr) {
        if(i == n & j == n) {
            
            list.add(new String(sbr));
            return ;
        }
        
        if(i < n) {
            StringBuffer newsbr = new StringBuffer(sbr);
            newsbr.append("(");
            getParenthsis(n, list, i+1, j, newsbr);               
        }
        
        if(j < n && i > j) {
            StringBuffer newsbr = new StringBuffer(sbr);
            newsbr.append(")");
            getParenthsis(n, list, i, j+1, newsbr);  
        }
        
        
        
    }
}