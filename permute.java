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
        int[] newnum = new int[num.length];  // ע������һ��Ҫ����һ���µ�num, �������ֱ�Ӷ�num�ı�Ļ�����������num �ͱ仯��
        for(int k=0; k< num.length ;k++) {
            newnum[k]=num[k];
            
        }
        
        int temp = newnum[level];
        newnum[ level ] = newnum[ i];
        newnum[i] = temp;
        return( newnum );
    }
}