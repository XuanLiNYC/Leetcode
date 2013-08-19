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
    public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function

        
        int result = check(root, 1);
        return(result);
    }
    
    public int check(TreeNode root, int start) {
        if(root == null){
            return(start -1);
        }
        if(root.left == null && root.right == null){
            return(start);
        }


        
        if(root.left != null || root.right != null){
            int l = -1;
            int r = -1;
            l = check(root.left,start+1);
            r = check(root.right, start+1);
            return(Math.max(l,r));
        }
        
        return( -1);
    }
}