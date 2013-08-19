public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList< ArrayList<Integer>>();
        
        permute ( num, 0, list);
        return (list) ;
        
    }
    
    public void permute (int[] num, int level, ArrayList<ArrayList<Integer>> list) {
        
        if(level == num.length) {
            ArrayList<Integer> templist = new ArrayList<Integer>();
            for ( int i=0;i< num.length ;i++) {
                
                templist.add(num[i]);
            }
            list.add(templist);
            
        } else {
            for(int j=level; j< num.length; j++) {
                  int[] newnum = num ;
                if( j!= level) {
                    newnum = swap(num, j, level);
                }
                permute(newnum, level+1, list);
            }
            
        }
     
        
    }
    
    public int[] swap(int[] num, int i, int level) {
        int[] newnum = new int[num.length];  // 注意这里一定要生成一个新的num, 否则如果直接对num改变的话主程序里面num 就变化了
        for(int k=0; k< num.length ;k++) {
            newnum[k]=num[k];
            
        }
        
        int temp = newnum[level];
        newnum[ level ] = newnum[ i];
        newnum[i] = temp;
        return( newnum );
    }
}