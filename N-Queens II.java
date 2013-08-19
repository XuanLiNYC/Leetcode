public class Solution {
    public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n<=0){
            return(0);
        }
        
        int[] save = new int[n];
        ArrayList<int[]> list = new  ArrayList<int[]> ();
        queen(save, 0, list);
        return(list.size());
    }
    
    public  void queen(int[]cur, int start, ArrayList<int[]> list) {
        int l = cur.length;
        
       if(start == l) {
            list.add(cur);
        } else {
            for(int i = 1; i <= l; i ++){
                
                cur[start] = i;
                if(checkValid(cur, start))
                {
                    int[] next =new int[l];
                    for(int m = 0 ; m < start+1; m ++){
                        next[m]=cur[m];
                    }
                    queen(next, start+1, list);
                    
                }
                cur[start] = 0;
            }
            
        }
        
        
    }
    
    public boolean checkValid(int[]cur, int start) {
        for(int i = 0 ; i <start; i ++){
            if(cur[i] ==  cur[start]){
                return(false);
            }
            if(Math.abs(start - i) == Math.abs(cur[start]-cur[i])){
                return(false);
            }
        }
        return(true);
    }
}