public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int size = triangle.size();
        int min = Integer.MIN_VALUE;
        if(size == 1) {
         ArrayList<Integer> temp = triangle.get(0);
         min = temp.get(0);
         return(min);
        }
        
        for(int i = 1 ; i < size; i++) {
            ArrayList<Integer> cur = triangle.get(i);
            ArrayList<Integer> pre = triangle.get(i-1);
            for(int j = 0 ; j < cur.size(); j++) {
                if(j == 0) {
                 cur.set(0, cur.get(0) + pre.get(0));
                 continue;
                }  
                if(j == cur.size()-1) {
                    cur.set(cur.size()-1, cur.get(cur.size()-1)+ pre.get(pre.size()-1));
                    continue;
                }
                
                cur.set(j, Math.min(pre.get(j-1), pre.get(j))+ cur.get(j));
             
            }
      
        }
        
       ArrayList<Integer> last = triangle.get(size-1); 
       for(int i = 0 ; i < last.size(); i++) {
           if(min == Integer.MIN_VALUE) {
               min = last.get(i);
           } else {
               if(min > last.get(i)) {
                   min = last.get(i);
               }
               
           }
       }
       
       return(min);
    }
}