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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        if(root == null) {
            return(list);
        }
        
        ArrayList<TreeNode> nodelist = new ArrayList<TreeNode>();
        nodelist.add(root);
        
        while(nodelist.size() != 0 ){
            int size = nodelist.size();
            ArrayList<Integer> innerlist = new ArrayList<Integer>();
            for(int i = 0 ; i < size; i ++) {
                TreeNode tempnode = nodelist.get(i);
                innerlist.add(tempnode.val);
                if(tempnode.left != null){
                 nodelist.add(tempnode.left);   
                }
                 if(tempnode.right != null){
                 nodelist.add(tempnode.right);   
                } 
                nodelist.remove(i);
                i--;
                size--;
            }
            list.add(innerlist);
           
            
            

            
        }
        
        return(list);
        
    }
}