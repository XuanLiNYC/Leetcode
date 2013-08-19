public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if((A.length <= 1)|| (A == null) ){
            return(0);
        }
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        int sum = 0 ; 
       
        for(int i = 0; i < A.length ; i ++) {
            if(A[i]<=0) {
                
            } else {

                int size = list.size();
                 
                
                    int pre = 0;
                    int j = 0 ;
                    int p = -1;
                    for( j = 0 ; j < size; j ++) {
                        int[] temp = list.get(j);
                        
                        if(temp[0]<=A[i]) {
                            sum += (i-temp[1]-1 )* (temp[0]-pre);
                            pre =  temp[0];
                          //  temp[0]=0;
                          list.remove(temp);
                          j--;
                          size =size -1;
                        } else {
                            if(p<0){
                                p = j;
                            }
                            sum += (i-temp[1]-1 )* (A[i]-pre);
                            pre =  temp[0];
                          //  temp[0]=0;
                            break;
                            
                        }
                    }
                    
                    int[] newtemp = new int[2];
                    newtemp[0] = A[i];
                    newtemp[1]= i;
                    if(p < 0){
                        p=0;
                    }
                    list.add( p, newtemp);
   
           
            }
        }
       
        return(sum);
        
    }
    
}