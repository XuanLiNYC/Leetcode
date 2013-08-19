public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuilder sbr = new StringBuilder();
        int n = 0;
        int step = nRows*2-2;
        int N = s.length();
        char[] A = s.toCharArray();
        
        while(n<nRows){
            int temp = n;
            while(temp< N){       
               sbr.append(A[temp]);
               if( (temp+step-2*n < N )&&( n != 0) &&(n != nRows-1)) {
                   sbr.append( A[temp+step -2*n] );
               }
               temp += step;  
            }
            n++;

        }
        
        return(new String(sbr));
    }
}