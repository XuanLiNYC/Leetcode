public class Solution {
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Integer> left = new Stack<Integer>();
        Stack<Integer> right = new Stack<Integer>();
        
        for(int i = 0 ; i < s.length(); i ++){
            if(s.charAt(i) == '('){
                left.push(i);
            } else if(s.charAt(i) == ')'){
                if(!left.isEmpty()){
                    left.pop();
                } else {
                    right.push(i);
                }
            }
        }
        
        int max = -1;
        int pre = s.length()-1;
        if(left.isEmpty() && right.isEmpty()){
            max = s.length();
            return(max);
        }
        
        while(!left.isEmpty() || !right.isEmpty()){
            int value  = -1;
            int tag = -1;
            if(!left.isEmpty()){
                value = left.peek();
                tag = 0;
            }
            if(!right.isEmpty()){
                if(right.peek() > value){
                   value = right.peek();    
                   tag = 1;
                }
            }
            
            if(max == -1){
                max = pre - value;  // 这里注意，对于initial是length -value.或者应该直接把pre = s.length()
            } else {
                if(pre -value -1 > max){
                    max = pre -value -1 ;
                }
            }
            
            if(tag == 0){
                left.pop();
                tag = -1;
            } else if(tag == 1) {
                right.pop();
                tag = -1;
            }
            pre = value;
            
        }
        
        if(max < pre ) {
            max = pre ;
        }
        
        return(max);
    }
}