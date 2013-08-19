public class Solution {
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if((word1.length() == 0) || (word1 == null)){
            return(word2.length());
        } 
        if((word2.length() == 0) || (word2 == null) ){
            return(word1.length());
        }
        
        
        int l1 = word1.length();
        int l2 = word2.length();
        int N = l1;
        if( l2 > l1) {
            N = l2;
        }
        
        int[][] save = new int[N+1][N+1];
        for(int i = 0; i <= N; i ++){
            for(int j = 0 ; j <= N; j ++) {
                
                save[i][j] = -1;
            }
        }
        
        
        return(change(word1,word2,0,0, save));
    }
    
    public int change(String s1, String s2, int i, int j, int[][] save) {
        if((s1.length() == i) &&  (s2.length() ==j)) {
            save[i][j] = 0;
            return(0);
        }
        
        if(s1.length() == i){
           
                save[i][j] = s2.length()-j;
            
            return(s2.length()-j );
        }
        
        if(s2.length() ==j) {
             save[i][j] = s1.length() -i;
            return(s1.length() -i);
        }
        
        if(s1.charAt(i) == s2.charAt(j)){
            if(save[i][j] == -1) {
            int result = change(s1,s2,i+1,j+1, save);
            save[i][j] =result;
            return(result); 
                
            } else {
                return(save[i][j]);
                
            }

        } else {
            if(save[i][j] == -1){
            int result3 = change(s1,s2,i+1,j+1, save)+1;
            int result1 = change(s1,s2,i,j+1, save)+1;
            int result2 = change(s1,s2,i+1,j, save)+1;

            
            int result = Math.min(Math.min(result1,result2),result3);
            save[i][j] = result ;
            return(result);
                
            } else {
               return(save[i][j]);
            }
            
            
        }
    }
}