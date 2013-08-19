public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
       
     for(int i = 0 ; i < num.length; i++) {
        if(i > 0){
            if(num[i-1] == num[i]){
                continue;
            }
        }
         check( list, i,num);
     }
     
     return(list);
    }
    public void check(ArrayList<ArrayList<Integer>> list ,int n, int[] num) {
        int end = num.length-1;
        int start = n;
        while(start+1 < end){
            int tempsum = num[n]+ num[start+1]+ num[end];
            if(tempsum > 0){
                end --;
            } else if(tempsum < 0){
                start++;
            } else {
                ArrayList<Integer> newlist = new ArrayList<Integer>();
                newlist.add(num[n]);
                newlist.add(num[start+1]);
                newlist.add(num[end]);
                if(list.contains(newlist)){
                    
                } else{
                    list.add(newlist);
                }
                
                start++;
                end--;
            }
        }
        return;
    }
}