public class Solution {
    public String multiply(String num1, String num2) {
        // Start typing your Java solution below
        // DO NOT write main() function

        int l1 = num1.length();
        int l2 = num2.length();
        
        int[] save = new int[l1+l2];
        int sum = 0;
        int carry = 0;
        
        for(int i = l1-1 ; i >= 0; i--) {
            int temp1 = num1.charAt(i) -'0';
           carry = 0;
            for(int j = l2-1; j>=0 ; j--) {
                int temp2 = num2.charAt(j) - '0';
                sum = save[i+j+1] + temp1 * temp2 + carry;
                if(sum >= 10){
                    carry = sum /10;
                    sum = sum % 10;
                } else {
                    carry = 0;  // 注意这个一开始忘记了，所以出错了
                }
                save[i+j+1] = sum;               
            }
            
            if(carry != 0){
                save[i] = save[i]+ carry;
                carry = 0;
            }   
        }
        
        
        StringBuffer sbr = new StringBuffer();
        // 下面是去掉前面多余的0
        int m = 0;
         while( m < l1+l2-1 && save[m] == 0){
              m ++; 
            }    

        for(int i = m ; i < l1+l2 ; i++) {
            
            if( l1+l2 >1 && save[0] == 0){
                
            } 
            char c= (char) (save[i]+ '0');  // 注意变换的时候的强制类型转换
            sbr.append(c);
        }
        
        return(new String(sbr));
    }
}