public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        if( k > n) {
            return(list);
        }
        if(n <= 0) {
           return(list);
        }
        
        ArrayList<Integer> templist =  new ArrayList<Integer>();
        getCombine(n, k , 1, 0,list , templist);
        return(list);
    }
    
    public void getCombine(int n, int k, int i, int j, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> templist ) {
        if( j == k) {
            list.add(templist);
            return;
        }
        if(i > n) {
            return;
        }
        
        ArrayList<Integer> newtemplist1 = new ArrayList<Integer> (templist);
        getCombine(n, k , i+1, j, list, newtemplist1);
        
       
        ArrayList<Integer> newtemplist2 = new ArrayList<Integer> (templist);
            
        newtemplist2.add(i);
        getCombine(n, k , i+1, j+1, list, newtemplist2); 

    }
}