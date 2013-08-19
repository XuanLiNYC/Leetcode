public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int size = prices.length ;
        if(size == 0) {
            return(0);
        }
        int[] front = new int[size];
        int[] back = new int[size];
        
        int profit = 0;
        front[0] = 0;
        int min = prices[0];
        for(int i = 1 ; i < size; i++ ) {
            if(prices[i] - min > profit) {
            profit = prices[i] - min;
            } 
            
            if(prices[i] < min) {
                min = prices[i];
            }
            front[i] = profit;
        }
        
        
        back[size-1] = 0;
        int max = prices[size-1];
        profit = 0;
        for(int j = size-2; j >= 0; j--) {
            if(max - prices[j] > profit ){
                profit = max - prices[j];
            }
            
            if(prices[j] > max) {
                max = prices[j];
            }
            
            back[j] = profit;
        }
        
        int totalmax = 0;
        for(int i = 0 ; i < size; i++) {
            int temp = front[i] + back[i];
            if(temp > totalmax) {
                totalmax = temp;
            }
        }
        return(totalmax);
       
    }
}