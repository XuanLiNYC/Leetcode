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
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        getNumber(root, list,0);
        int sum = 0;
        
        for(int i : list) {
            sum += i;
        }
        return(sum);
    }
    
    
    public void getNumber(TreeNode root,ArrayList<Integer> list , int n ) {
        if(root == null) {
            return;
        }
        
        if(root.left ==null && root.right == null) {
            list.add(n*10 + root.val);
            return;
        }
        
        int sum = root.val + n*10;
        if(root.left != null) {
            getNumber(root.left, list, sum);
        }
        if(root.right != null) {
            getNumber(root.right, list, sum);
            
        }
        
        
    }
    
}