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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num.length ==0 ) {
            return(null);
        }
        
    
        TreeNode result =convert(num, 0, num.length -1 );
        return(result);
    }
    
    public TreeNode convert(int[] num, int start, int end) {
        if(start > end) {
            return(null);
        }
        
        int mid =  (end + start) /2 ;
        TreeNode left = convert(num, start, mid-1);
        TreeNode parent =  new TreeNode(num[mid]);
        TreeNode right = convert(num, mid+1, end);
        parent.left = left;
        parent.right = right;
        return(parent);
        
    }
}