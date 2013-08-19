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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = inorder.length-1;
        if(length <0){
            return(null);
        }
        TreeNode root = buildTree(inorder, postorder, 0, length, 0, length);
        return(root);
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder, int si, int ei, int sp, int ep){
        if(sp > ep || sp > ep){
            return(null);
        }

        
        int val = postorder[ep];
        int midin= getPosition(inorder, val, si, ei);
        int pleft = midin-1-si+sp;
  
        TreeNode root = new TreeNode(val);
        TreeNode left = buildTree(inorder, postorder, si, midin-1, sp, pleft);
        TreeNode right =  buildTree(inorder, postorder,midin+1, ei, pleft+1, ep-1);
        root.left = left;
        root.right = right;
        return(root);
    }
    
        public  int getPosition(int[] inorder, int value, int start, int end){
	        if(start > end){
	            return(Integer.MIN_VALUE);
	        }
	       int min = start;
	       while(min <= end){
	    	   if(inorder[min] == value){
	    		   return(min);
	    	   }
	    	   min++;
	       } 
	        return(min);
	    }
}