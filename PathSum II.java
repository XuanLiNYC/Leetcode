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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
     ArrayList<ArrayList<Integer>> totallist = new ArrayList<ArrayList<Integer>>();
     ArrayList<Integer> onelist = new ArrayList<Integer>();
     if( root == null ){
         return(totallist);
     } else {
         
         totallist = path(totallist,onelist, root, sum);
         return(totallist);
     }
     
    }
    public ArrayList<ArrayList<Integer>> path(ArrayList<ArrayList<Integer>> totallist, ArrayList<Integer> onelist, TreeNode root, int sum) {
        if((root.left == null) && (root.right == null) ) {
            if(root.val == sum) {
                onelist.add(root.val);
                totallist.add(onelist);
                return(totallist);
            }
        }
        
        if(root.left != null) {
            ArrayList<Integer> newlist = new ArrayList<Integer>();
            newlist.addAll(onelist);
            newlist.add(root.val);
            path(totallist, newlist, root.left, sum- root.val);
        }
        
        if(root.right != null) {
            ArrayList<Integer> newlist = new ArrayList<Integer>();
            newlist.addAll(onelist);
            newlist.add(root.val);
            path(totallist, newlist, root.right, sum- root.val);
        }
        return(totallist);
    }
    
    
}