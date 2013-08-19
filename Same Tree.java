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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(q == null && p == null){
            return(true);
            
        }
        if(q != null && p != null) {
             if(p.val == q.val){

                 boolean l = isSameTree( p.left,  q.left);
                 boolean r = isSameTree( p.right,  q.right);
                 return( l && r);               
             } else {
                  return(false);
            }           
        } else {
            return(false);
        }


    }
}