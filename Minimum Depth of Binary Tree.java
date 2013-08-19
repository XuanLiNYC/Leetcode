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
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return(0);
        }
        
        int result = check(root,1);
        return(result);
    }
    
    public int check(TreeNode root,int start){
        if(root.left != null &&  root.right != null){
            return(Math.min(check(root.left,start+1), check(root.right,start +1)));
        }
        if(root.left == null && root.right == null){
            return(start);
        }
        int l = -1;
        int r = -1;

        
        if(root.left != null){
            l = check(root.left,start+1);
        }
        
        if(root.right != null){
           r = check(root.right,start+1);
        }
        
      
        if( l == -1){
            l = r;
        } else {
            r = l;
        }
        
        return(Math.min(l,r));
        
        
        
        
 
        
       
    }
}