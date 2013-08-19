public class Solution {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] save = new int[101];
        for(int i = 0 ; i <101; i ++) {
            save[i]= -1;
        }
        if(num.length <=1){
            return;
        } else {
            for(int i = num.length-1; i>=0;i --) {
               if(save[num[i]]== -1) {
                   save[num[i]] = i;
               }
               
               if((i < num.length -1) &&(num[i] < 101)) {
                   for(int j = num[i]+1 ; j <= 100; j ++) {
                       if( save[j] != -1) {
                           int position = save[j];
                           int tempvalue = num[position];
                           num[position] = num[i];
                           num[i] = tempvalue;
                           Arrays.sort(num, i+1, num.length);
                           return;
                       }
                   }
               }
                 
            }
            Arrays.sort(num);
         
            
        }
    }
    
    
}