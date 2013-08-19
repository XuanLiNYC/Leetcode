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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int tag = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(root  == null) {
            return(list);
        }
        
        ArrayList<TreeNode> nodelist = new ArrayList<TreeNode>();
        nodelist.add(root);
        
        while(nodelist.size() != 0 ){
            ArrayList<Integer> newlist = new  ArrayList<Integer>();
            int size = nodelist.size();
             if(tag ==0) {
               for(int i = size-1 ; i >= 0 ; i--) {
                   TreeNode temp =  nodelist.get(i);
                   newlist.add(temp.val);
                  if(temp.left != null) {
                       nodelist.add(temp.left);
                   }
                   if(temp.right != null) {
                       nodelist.add(temp.right);
                   }  

               }
                
            } else if(tag == 1) {
                
               for(int i = size-1 ; i >= 0 ; i--) {
                   TreeNode temp =  nodelist.get(i);
                   newlist.add(temp.val);
                   

                   if(temp.right != null) {
                       nodelist.add(temp.right);
                   } 
                    if(temp.left != null) {
                       nodelist.add(temp.left);
                   }

               }                
                
            }
                     
              nodelist.subList(0,size).clear();
              list.add(newlist);
              tag ++;
              if(tag == 2) {
                  tag = 0;
              }
            
        }  
        
        return(list);
        
    }
}