public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        

            if(num[0]< target) {
                ArrayList<Integer> templist = new ArrayList<Integer>();
                ArrayList<Integer> templist1 = new ArrayList<Integer>();
                
                combine(num, 0+1, target, templist1, list);
                templist.add(num[0]);
                combine(num, 0+1, target - num[0], templist, list);
            } else if(num[0]== target){
                ArrayList<Integer> templist = new ArrayList<Integer>();
                 templist.add(num[0]);
                 list.add(templist);     
            } 
      
        return(list);
    }
    
    public void combine(int[] num, int i, int target, ArrayList<Integer> templist,  ArrayList<ArrayList<Integer>> list) {
        if(i >= num.length) {
            return;
        }
        
        
 
            if(num[i]< target) {
                
               ArrayList<Integer> newlist = new ArrayList<Integer>();
               ArrayList<Integer> newlist1 = new ArrayList<Integer>();
               newlist.addAll(templist);
               newlist1.addAll(templist);
  
                 combine(num, i +1, target, newlist,list); 
               
  
               newlist1.add(num[i]);
               combine(num, i +1, target-num[i], newlist1,list);               
            } else if(num[i]== target) {
                templist.add(num[i]);
                if(list.contains(templist)){
                    
                } else {
                list.add(templist);  
                }

                return;
            } else {
                return;
            }
        
        
    }
}