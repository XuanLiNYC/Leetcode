public class Solution {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] digi = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sbr = new StringBuffer();
        if(num <= 0) {
            return(new String(sbr));
        }
        
        for(int i = 0 ; i < digi.length; i++) {
            while(num >= digi[i]) {
                sbr.append(str[i]);
                num -=digi[i];
            }
        }
        
        return(new String(sbr));
    }
}