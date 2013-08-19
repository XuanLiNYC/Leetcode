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
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) {
            return(false);
        }
        
        if ((root.left == null ) && (root.right == null )) {
            if(sum == root.val){
                return(true);
            } else {
                return(false);
            }
        } 
        boolean result = false;
        if(root.left != null ){
          result |=  hasPathSum(root.left, sum-root.val);   
        }
        
        if(root.right != null ){
          result |=  hasPathSum(root.right, sum-root.val);
        }
        return(result);
    }
}