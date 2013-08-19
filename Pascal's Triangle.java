public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        getlist(numRows, list);
        return(list);
    }
    
    public void getlist(int n, ArrayList<ArrayList<Integer>> list) {
        
        if(n == 1){
            ArrayList<Integer> templist = new ArrayList<Integer>();
            templist.add(1);
            list.add(templist);
            return;
        }
        
         if(n == 2){
             getlist(1, list);
            ArrayList<Integer> templist = new ArrayList<Integer>();
            templist.add(1);
            templist.add(1);
            list.add(templist);
            return;
        }
        
        if( n > 2){
            getlist(n-1, list);
            
           ArrayList<Integer> templist = list.get(n-2); // 这里开始写错了，注意，是-2 不是-1
            ArrayList<Integer> newlist = new  ArrayList<Integer>();
           for(int i = 0 ; i < templist.size(); i++){
               if(i == 0){
                   newlist.add(1);
               } else {
                   int tempvalue =templist.get(i-1) +templist.get(i);
                   newlist.add(tempvalue);
               }
           }
           newlist.add(1);
           list.add(newlist);
           return;
           
        } 
            
    }
    
        
}