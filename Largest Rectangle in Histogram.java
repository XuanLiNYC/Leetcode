public class Solution {
    public int largestRectangleArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if((height.length == 0) || (height == null)) {
            return(0);
        } 
        
        int N= height.length;
        int n = 0 ;
        int max = -1;
        
        Stack<Integer> stack =  new Stack<Integer>();
    
        
        while(n < N) {
            if(stack.isEmpty()){
                stack.push(n);
                n++;    
            } else if(height[n] < height[stack.peek()] ) {
                int temp = stack.pop();
                int h = height[temp];
                int L = n;
                if(!stack.isEmpty()){
                    L=n-stack.peek()-1;
                }
                int temparea = h * L;
                
                if(max == -1) {
                    max = temparea ;   
                } else if( temparea > max) {
                    max = temparea;
                }
             
            } else if(height[n] >= height[stack.peek()]){
                
               stack.push(n);
                n++; 
            }
            
        }
        
        while(!stack.isEmpty()) {
                int temp = stack.pop();
                int h = height[temp];
                int L = n;
                if(!stack.isEmpty()){
                    L=n-stack.peek()-1;
                }
                int temparea = h * L;
                
                if(max == -1) {
                    max = temparea ;   
                } else if( temparea > max) {
                    max = temparea;
                }
             
        }
        
        return(max);
        
        
    }
}