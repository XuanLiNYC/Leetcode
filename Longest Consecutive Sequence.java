import java.util.Hashtable;
public class Solution {
    public int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashSet<Integer> set =  new HashSet<Integer>();
        int max = 0;
       Hashtable<Integer, Integer> saveset = new Hashtable<Integer,Integer>();
        
        for(int i = 0; i < num.length ; i++) {
            if(set.contains(num[i])) {
                
            } else {
                
            set.add(num[i]);
            int result = check(num[i], max, saveset);
            if(result > max);
            max = result ; 
            
            }

        }
        return(max);
    }
    
    public int check(int num, int max, Hashtable<Integer,Integer> saveset) {
  
        if(saveset.containsKey(num -1) && saveset.containsKey(num+1) ) {
            int start = saveset.get(num -1);
            int end = saveset.get(num +1);
            saveset.remove(num -1);
            saveset.remove(num +1);
            saveset.put(start, end);
            saveset.put(end, start);
            int tempvalue = end -start +1;
            if(max < tempvalue)
                max = tempvalue;
        } else if (saveset.containsKey(num -1)) {
            int value = saveset.get(num -1);
            saveset.remove(num-1);
            saveset.put(num, value);
            saveset.put(value,num);
            
            int tempvalue = Math.abs(num -value) +1;
            if(max < tempvalue)
                max = tempvalue;
            
        } else if(saveset.containsKey(num+1)) {
            
            int value = saveset.get(num +1);
            saveset.remove(num+1);
            saveset.put(num, value);
            saveset.put(value,num);
            int tempvalue = Math.abs(num -value) +1;
            if(max < tempvalue)
                max = tempvalue;
            
        } else {
            saveset.put(num, num);
                
            if(max < 1)
                max = 1;
            
            
        }
        
        return(max);
        
        
        
        
    }
}