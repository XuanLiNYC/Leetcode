public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Character> stack = new Stack<Character>();
    
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('|| c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()){
                    return(false);
                } else {
                    char tempc = stack.peek();
                    if( c == ')' && tempc == '('){
                        stack.pop();
                    } else if( c == '}' && tempc == '{'){
                         stack.pop();
                    } else if ( c == ']' && tempc == '['){
                        stack.pop();
                    } else {
                        return(false);
                    }
                    
                }
            }
        }
        
        if(stack.isEmpty()){
            return(true);
        } else{
            return(false);
        }
    }
}