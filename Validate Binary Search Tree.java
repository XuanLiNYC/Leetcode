/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while(( root != null) || (!stack.isEmpty()) ) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            
            if(!stack.isEmpty()) {
                root = stack.pop();
                list.add(root.val);
               
             root =root.right;
               
            }
        }
        
        
        for(int i = 1; i < list.size() ;i++) {
            if(list.get(i-1) < list.get(i)) {
                
            }else {
                return(false);
            }
        }
        return(true);
    }
}