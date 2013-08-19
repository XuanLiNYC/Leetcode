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
        if(root == null)
        return ( 0 );
        
     
        int sum = 0;
        ArrayList<Integer> list = new ArrayList <Integer> ();
           getNumbers(list, root, root.val);
        
        for(int i=0;i< list.size() ;i ++) {
            
            sum +=list.get(i);
        }
        return (sum);
    }
        public void getNumbers(ArrayList<Integer> list, TreeNode root, int value) {  // 注意开始写错了，写成root== null再记录数字，这样子左右子树分别记一次就重复了。
            if (( root.left == null  ) && ( root.right == null)) {
                list.add(value);  
            } else {
                if(root.left != null ) {
                    
                     getNumbers(list, root.left, value*10+root.left.val);
                }
               
                 if(root.right != null ) {
                    
                     getNumbers(list, root.right, value*10+root.right.val);
                }
            }
    
        }
        
    
}