/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if((head == null) || (head.next == null) ) {
            return(head);
        }
        ListNode newhead = new ListNode( Integer.MIN_VALUE);
        newhead.next = head ;
        ListNode pre = newhead;
        ListNode cur = head;
        ListNode precur = newhead;
        
        while(cur != null) {
            if(cur.val < x ) {
                if(pre == precur ) {
                pre = cur;
                precur = cur;
                cur = cur.next;   
                } else {
                    precur.next = cur.next;
                    cur.next = pre.next;
                    pre.next = cur;
                    pre = cur;
                    cur = precur.next;
                }
    
            } else {
                precur = cur;
                cur = cur.next ;
                
            }
            
        }
        
        return(newhead.next);
    }
}