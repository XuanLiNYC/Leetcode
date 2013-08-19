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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        
        if(root!= null) {
         //inorder(root, list); 
         check(root, list);
        }

        return(list);
    }
    
    public void check(TreeNode root, ArrayList<Integer> list) {
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        
        while((!stack.isEmpty()) || (node != null) ) 
        {     
            while(node!= null) {
                stack.push(node);
                node = node.left ;
                
            }
            
            if(!stack.isEmpty()){
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }   
            
        }
        
    }
    
    
    
    
    public void inorder(TreeNode root, ArrayList<Integer> list ){
        if(root.left!=null) {
            inorder(root.left,list);
            
        }

            list.add(root.val);
            
        if(root.right!=null) {
            inorder(root.right,list);
            
        }
      
        
    }
}