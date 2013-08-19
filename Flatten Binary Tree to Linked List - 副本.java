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
        TreeNode right =  root.right;
        root.left = null;   
        root.right = null;
        
          if(left!= null) {
              flatten(left);
          }
          
          if(right != null) {
              flatten(right);
          }
          

         
          if(left == null) {
              root.right = right;
    
          } else {
                root.right = left;
                
              if(right != null) {
                 TreeNode p = left;
                  while(p.right != null) {
                      p = p.right ;
                  }
                  p.right = right;
              } 
              
          }
          
    
        
    }
    
  
}