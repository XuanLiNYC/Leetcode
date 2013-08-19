public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
     
        int carry = 1 ;
        int sum = 0;
        
        for(int i = digits.length-1 ; i >= 0 ; i --) {
            sum = digits[i] + carry;
            if(sum == 10) {
                digits[i] =0;
                carry =1;
            } else {
                digits[i]= sum;
                carry = 0;
                return(digits);
            }
            
        }
        
        if(carry == 1) {
            int[] returndigis = new int[digits.length+1];
            returndigis[0]= 1;
            
            for(int i = 1 ; i < digits.length+1 ; i ++){
                returndigis[i] =digits[i-1];
            }
            return(returndigis);
        } else {
            return(digits);
        }
    }
}