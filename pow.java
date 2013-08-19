public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function


      
      if(n == 0){
         return(1);
     }
     
      if(x == 0){
          return(0);  // 0^0 ==1 ע��
      }
      
     if (n<0) {    //ע�� n < 0�����
        x = 1/x;
     } 
     

        int tag = 0;
    if(n == Integer.MIN_VALUE) {   //����������Ƕ��������߽����֤
        n=Integer.MAX_VALUE;
        tag =1;
        x=1/x;
    }
     
     double step = x;
     int m = Math.abs(n);
     double sum = 1;
     
     while(m >1){
         if(m % 2 == 1) {
             sum = sum* step;
         }
         m = m /2;
         step = step*step;
     }
     
     sum = sum* step;

        if(tag == 1){
            sum = sum* x;
        }
    
     return(sum);
    

     
     
    }
}