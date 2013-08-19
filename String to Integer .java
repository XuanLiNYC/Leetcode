public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
       str = str.trim();
       if(str.length()  == 0) {
           return(0);
       }
       char[] array = str.toCharArray();
       int start = 0;
       int sign = 1;
       if(str.charAt(0) == '-') {
           sign = -1;
           start = 1;
       } else if(str.charAt(0) == '+'){
           start = 1;
       }
       
       int sum = 0;
       int dif = 1;
       
       for(int i = start; i < array.length ; i++) {
           if(array[i] <= '9' && array[i] >= '0') {
               if(sign == 1) {
                   if(Integer.MAX_VALUE / 10 - sum > 0 ) {
                       sum = sum*10 + array[i] - '0';
                   } else if( Integer.MAX_VALUE / 10 - sum == 0 && Integer.MAX_VALUE%10 >= array[i] - '0') {
                       sum = sum*10 + array[i] - '0';
                   }
                   else {
                       return(Integer.MAX_VALUE);
                   }     
               }
               
               if(sign == -1) {
                   //if((Integer.MAX_VALUE / 10 - sum ) * 10 +Integer.MAX_VALUE % 10 >= array[i] - '0'  ) {
                //       sum = sum*10 + array[i] - '0';
                 //  } else if (Integer.MAX_VALUE / 10 - sum  +1 == array[i] - '0' ) {
                  //     return(Integer.MIN_VALUE);
                   if(Integer.MAX_VALUE / 10 - sum > 0 ) {
                       sum = sum*10 + array[i] - '0';
                   } else if( Integer.MAX_VALUE / 10 - sum == 0 && Integer.MAX_VALUE%10 >= array[i] - '0') {
                       sum = sum*10 + array[i] - '0';
                   
                   } else {
                        return(Integer.MIN_VALUE);
                   }                   
               }
               
           } else {
               if(sum == 0){
                return(0);                  
               } else {
                   return(sign * sum);
               }

           }
           
       }
       
       return(sum * sign );
    }
}