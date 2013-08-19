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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int level = 0;
        level = getLevel(root,1);
        for(int i = level; i >=1; i--){
            ArrayList<Integer> templist = new ArrayList<Integer>();
            savelist(root, templist, i, 1);
            list.add(templist);
        }
         
       return(list); 
    }
    public void savelist(TreeNode root, ArrayList<Integer> list, int level, int start) {
     if(start == level && root != null){
         list.add(root.val);
         return ;
     } else if(start < level){
         if(root != null) {
             savelist(root.left, list, level, start+1);
             savelist(root.right, list, level, start+1);
         } else {
             return;
         }
     } else {
         return;
     }
     
    }
    
    public int getLevel(TreeNode root, int start) {
        if(root != null) {
            return(Math.max(getLevel(root.left,start+1),getLevel(root.right,start+1)));
        } else {
            return(start-1);
        }
        
    }
}