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
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) {
            return(true);
        }
       
            return(check(root.left, root.right));
       
    }
    
    public boolean check(TreeNode left, TreeNode right) {
        if((left == null) &&(right == null) ){
            return(true);
        } else if ((left == null) || (right == null)){
            return(false);
        } else {
        if(left.val == right.val) {
           return( check(left.right, right.left) && ( check (left.left,right.right)));
        } else {
            return(false);
        }            
        }
        

    }
}