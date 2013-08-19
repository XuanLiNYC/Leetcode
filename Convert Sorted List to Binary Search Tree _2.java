/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = 0;
        ListNode temphead = head;
        while(temphead!=null){
            temphead=temphead.next;
            n++;
        }
        if(n == 0){
            return(null);
        }
    
        Node returnnode = convert(head, 0,n-1);
        return(returnnode.n);
    }
    
    public Node convert(ListNode head, int start, int end) {
        if(start > end) {
            return(new Node(head, null));
        }
        
        int mid = (end + start ) /2 ;
        Node left = convert(head, start, mid-1) ;
        head =  left.l;
        TreeNode parent = new TreeNode(head.val) ;
        parent.left = left.n;
         head = head.next;
        
        Node right = convert(head,mid+1, end);
        parent.right = right.n;
        return(new Node(right.l, parent));
    }
    
    public class Node {
        ListNode l;
        TreeNode n;
        Node(ListNode head, TreeNode node) {
            this.l = head;
            this.n = node;
        }
    }

}
    
  