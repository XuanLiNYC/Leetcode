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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null) {          
            return(head);
        }
        
        ListNode newhead  = new ListNode(0);
        newhead.next = head;
        ListNode pre = newhead;
        ListNode cur = head;
        ListNode next = cur.next;
        while(cur != null && next != null) {
            pre.next = next;
            cur.next = next.next;
            next.next = cur;
            
            pre = cur;  // 这里一开始还写错了，笨啊！
            
            cur = pre.next;
            if(cur != null) {
                next = cur.next;
            }
         
        }
        
        return(newhead.next);
        
    }
}