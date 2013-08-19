public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(num.length < 3){
            return(0);
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(num);
        
        for(int i = 0 ; i < num.length; i ++) {
            check(i,num, target, list);
            int temp = list.get(0)+ list.get(1)+ list.get(2);
            if(temp == target){
                break;
            }
        }
        
        int sum = list.get(0)+ list.get(1)+ list.get(2);;
        

        return(sum);
    }
    
    public void check(int n, int[] num, int target, ArrayList<Integer> list){

        
        int start = n+1;
        int end = num.length -1;
        
        while(start < end){
            
            int tempsum = num[n]+num[start]+ num[end];
            int sum = 0;
             if(list.size() != 0){
               sum = list.get(0)+list.get(1)+list.get(2);  // 注意这里要更新sum的value
              }
            
            if(list.size() == 0){
                list.add(num[n]);
                list.add(num[start]);
                list.add(num[end]);
                sum = tempsum;
            } else {
                if(Math.abs(target - sum) > Math.abs(target - tempsum)) {
                    list.clear();
                list.add(num[n]);
                list.add(num[start]);
                list.add(num[end]);
                    
                }
                
            }
            
            if(tempsum < target ){
                start++;
            }
            
            if(tempsum > target){
                end --;
            }
            
            if(tempsum == target){
              break;

            }
       
            
        }
        
    }
    
}

