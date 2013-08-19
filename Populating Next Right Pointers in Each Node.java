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
            TreeLinkNode cur= root;
            TreeLinkNode pre = null;  // ��һ����ǰ��Ľڵ�֮ǰ
            TreeLinkNode next = null; // ��һ��Ŀ�ʼ�ڵ�
            
            while(cur!= null){
                if(pre == null){
                    pre = cur.right;
                    next = cur.left;
                } else {
                  pre.next = cur.left;
                }
                
                if(pre == null){   // �жϵ�
                    break;
                }
   
                 cur.left.next = cur.right;
                 pre = cur.right;
               
                
                if(cur.next != null){
                    cur = cur.next;
                } else {
                    cur.right.next = null;
                    cur = next;
                    pre = null;
                }
                
                
            }
            
            
        
        
    }
}