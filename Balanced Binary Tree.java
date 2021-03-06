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
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
     if(root == null) {
        return(true);
     }   
        int h = height(root);
        if(h == -1) {
            return(false);
        } else{
            return(true);
        }
     
    }
    
    public int height(TreeNode root) {
        if(root == null){
            return(0);
        } else if((root.left == null) && (root.right == null) ){
            return(1);
        } else {
            int L = height(root.left);
            int R = height(root.right);
            if((L == -1)||(R == -1)){
                return(-1);
            }
            if(Math.abs(L-R) > 1) {
                return(-1);
            } else {
                return(Math.max(L,R)+1);
            }
        }
    }  
}