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
    public int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int[] p = checkPath(root);
        return(Math.max(p[0],p[1]));
    }
    
    public int[] checkPath(TreeNode root) {
        int[] p = new int[2];
        if(root == null){
            p[0]= Integer.MIN_VALUE;
            p[1]= Integer.MIN_VALUE;
            return(p);
        }
        if(root.left == null && root.right == null){
            p[0]= root.val;
           // p[1]= Integer.MIN_VALUE;
           p[1]= root.val;
            return(p);
        } else {
            
            int[] l = checkPath(root.left);
            int[] r = checkPath(root.right);
            int sum = root.val;
            if(l[0]!=Integer.MIN_VALUE){
                sum +=l[0];
            }
            if(r[0]!=Integer.MIN_VALUE){
                sum +=r[0];
            }
            p[0] = Math.max(Math.max(l[0], r[0]), 0) + root.val;
            p[1] = Math.max(Math.max(Math.max(l[1], r[1]), Math.max(l[0],r[0])),sum);
            
            return(p);
        }
    }
}