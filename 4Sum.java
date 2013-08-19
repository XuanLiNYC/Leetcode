public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
      // DO NOT write main() function
      ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>> ();
      
      if(num.length <4) {
         return(list);
      }
      int N = num.length ;
      Arrays.sort(num);
      
      HashSet<String> set = new HashSet<String>();
      
      
      for(int i = 0; i <N-3 ; i++) {
          //if((i > 0 ) && (num[i-1] ==num[i])){
          //    continue;
        //  }
          for(int j = i+1; j < N-2; j++) {
           // if((j > i+1) && (num[j-1] == num[j])) {
          //        continue;
           //   }
              check(num, j+1, target-num[i]-num[j], num[i], num[j],list,set);
            
          }
      }
      
      return(list);
    }
    public void check(int[] num, int start, int target, int a, int b, ArrayList<ArrayList<Integer>> list, HashSet<String> set){
        int end = num.length-1;
        while(start < end) {
            int temp = num[start]+ num[end];
            if(temp < target) {
                start ++;
            } else if(temp > target) {
                end --;
            } else if(temp == target){
                ArrayList<Integer> newlist = new ArrayList<Integer>();
                newlist.add(a);
                newlist.add(b);
                newlist.add(num[start]);
                newlist.add(num[end]);
                String tempsave = new String();
                tempsave += a;
                 tempsave += b;
                  tempsave += num[start];
                   tempsave += num[end];
                
                
            
                if(set.contains(tempsave)){
                    
                } else {
                list.add(newlist);
                set.add(tempsave);
                }
  
                start++;
                end--;
            }
           
           /*
            while ((start -1 >= 0) & (start < end)) {
                if (num[start-1]==num[start]) {
                    start ++;
                } else {
                    break;
                }
                
            }
            
   
            
                        
             while ((end +1 <= num.length-1) && (end >start )) {
    			if(num[end+1]==num[end]){
				   end--;
				}else{
					break;
				}
			 
            }
            */
        }
        
        
        
    }
}