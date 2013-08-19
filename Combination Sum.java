public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
       ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int i = -1;
        for( i = candidates.length -1; i >=0 ; i--){
            if(candidates[i]<=target) {
                break;
            }
        } 
        
        if(i == -1) {
            return(list);
        }
        
        if(target <=0)
        {
            return(list);
        }
        ArrayList<Integer> templist = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combine(candidates, target, i, list, templist);
        return(list);
    }
    
    public boolean combine(int[] candidates, int target, int i, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> templist) {
        if(target == 0) {
            list.add(templist);
            return(true); 
        }
        
        if(i <0)  {
            return(false);
        }
        
        if(candidates[i]> target) {
            combine(candidates, target, i-1, list, templist);
            return(true);   
        }
        
        
        
     
             int temptarget = target;
             
             ArrayList<Integer> middlelist = new ArrayList<Integer>();
             for(int n=0; n< templist.size() ; n++) {
                 middlelist.add(templist.get(n));
             }
           
             while(candidates[i] <= temptarget) {
             
             temptarget -= candidates[i];
             middlelist.add(0, candidates[i]);
             
             ArrayList<Integer> nextlist = new ArrayList<Integer>();
             for(int m = 0; m < middlelist.size();m++) {
                 
                 nextlist.add(middlelist.get(m));
             }
            
               combine(candidates, temptarget, i-1, list, nextlist); 
            
                          
             } 
             
               ArrayList<Integer> middlelist1 = new ArrayList<Integer>();
             for(int n=0; n< templist.size() ; n++) {
                 middlelist1.add(templist.get(n));
             }
             
         combine(candidates, target, i-1, list, middlelist1); 
             return(true);
            
    }
}