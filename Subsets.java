public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>> ();
        ArrayList<Integer> templist = new ArrayList<Integer>();
        list.add(templist);
        
        if(S.length == 0 || S == null) {
            return(list);
        } 
        
        Arrays.sort(S);
        for(int i = 0 ; i < S.length; i ++) {
            int size = list.size();
            for(int j = 0 ; j < size; j++) {
                 ArrayList<Integer> newlist = new  ArrayList<Integer>(list.get(j));
                 newlist.add(S[i]);
                 list.add(newlist);
            }
        }
        
        return(list);
        
    }
}