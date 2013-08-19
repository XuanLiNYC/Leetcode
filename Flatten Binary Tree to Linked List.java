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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root == null) {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        if(left != null) {
            flatten(left);
            root.right = left ;
            
            while(root.right != null) {
                root = root.right ;
            }
        }
        if(right != null ){
            flatten(right);
            root.right = right ;
        }
    }
    
    
}