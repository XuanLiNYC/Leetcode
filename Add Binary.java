public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
       int la = a.length()-1;
       int lb = b.length()-1;
       
       int carry = 0;
       int m = Math.min(la, lb);
       StringBuffer sbr = new StringBuffer();
       
       for(int i = 0; i <= m; i++){
           int tempa = a.charAt(la-i)-'0';
           int tempb = b.charAt(lb-i)-'0';
           
           int sum = tempa+tempb+carry;
           
           if(sum>=2){
               carry = 1;
               sum = sum%2;

           } else{
               carry = 0;
           }
           
                char c = (char) ( sum+'0');
               sbr.insert(0,c);
       }
       
       m++;
       while(la-m >=0){
            int tempa = a.charAt(la-m)-'0';
             int sum = tempa+carry;
             if(sum>=2){
               carry = 1;
               sum = sum%2;

           } else{
               carry = 0;
           }
           
                char c = (char)( sum+'0' );
               sbr.insert(0,c);
               m++;
       }
       
         while(lb-m >=0){
            int tempb = b.charAt(lb-m)-'0';
             int sum = tempb+carry;
             if(sum>=2){
               carry = 1;
               sum = sum%2;

           } else{
               carry = 0;
           }
           
                char c = (char) ( sum+'0');
               sbr.insert(0,c);
               m++;
       }
       
       if(carry == 1){
           
                char c = '1';
               sbr.insert(0,c);
       }
       
       return(new String(sbr));
       
    }
}