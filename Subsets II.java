public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> onelist =  new ArrayList<Integer>();
        list.add(onelist);
        if(num.length == 0) {
            return(list);
        }
        Arrays.sort(num);
        
        int start = 0;      
        for(int i = 0 ; i < num.length; i ++) {
            int size = list.size();

            for(; start < size ; start ++) {
                ArrayList<Integer> templist = new  ArrayList<Integer> (list.get(start));
                templist.add(num[i]);
                list.add(templist);
            }
            
            if((i+1 < num.length) &&(num[i+1]==num[i])) {
                start = size;
            } else {
                start = 0;
            }
        }
        return(list);
    }
    

}