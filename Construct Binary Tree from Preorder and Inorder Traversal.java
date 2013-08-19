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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = preorder.length -1;
        TreeNode root = rebuild(preorder, inorder, 0, length, 0, length);
        return(root);
    }
    
    public TreeNode rebuild(int[] preorder, int[] inorder, int ep, int sp, int ei, int si) {
        if(ep > sp || ei > si){
            return(null);
        }
        
        int val = preorder[ep];
        int mid = search(inorder, val, ei, si);
        TreeNode root = new TreeNode(val);
        
        int pmid = ep+1 + (mid-1)-ei;
        
        TreeNode left = rebuild(preorder, inorder, ep+1, pmid , ei, mid-1);
        TreeNode right = rebuild(preorder, inorder, pmid+1, sp, mid+1, si );
        root.left = left;
        root.right = right;
        
        return(root);
        
    }
    
    public int search(int[] inorder, int val, int start, int end){
        if(start > end){
            System.out.println("Error in search");
            return(Integer.MIN_VALUE);
        }
        
        int mid = start;
        while(mid <= end){
            if(inorder[mid] == val){
                return(mid);
            }
            mid++;
        }
        return(mid);
    }
    
    
}