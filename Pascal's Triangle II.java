public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(rowIndex ==0) {
         list.add(1);       
         return(list);
        }
        
         if(rowIndex ==1) {
         list.add(1);  
         list.add(1);
         return(list);
        }
        
         list.add(1);  
         list.add(1);
         
         for(int i = 1 ; i < rowIndex;i++ ) {
             list.add(1);
             int size = list.size();           
             for(int j = size-2;  j > 0 ; j--){
                 int temp = list.get(j) + list.get(j-1);
                 list.set(j,temp); 
             }
             
         }
         
         return(list);
        
        
        
        

        
    }
}