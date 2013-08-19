/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return;
        }
         
        root.next = null;
        
        TreeLinkNode cur = root;
        TreeLinkNode pre = null;
        TreeLinkNode next = null;
        
        while(cur != null){
            if(pre == null){
                if(cur.left != null){
                    pre = cur.left;
                    next = cur.left;
                    continue;
                } else if(cur.right != null){
                    pre = cur.right;
                    next = cur.right;
                    continue;
                }              
            } else {
                if(cur.left != null && cur.left != pre){
                    pre.next = cur.left;
                    pre = cur.left;
                }
               if(cur.right != null && cur.right != pre){
                    pre.next = cur.right;
                    pre = cur.right;
                }
                            
            }
            
             if(cur.next != null){
                    cur = cur.next;
                } else {
                    if(pre != null){
                     pre.next = null;   
                     pre = null;
                    }

                    cur = next;
                    next = null;
                }
                
            
        }
    }
}