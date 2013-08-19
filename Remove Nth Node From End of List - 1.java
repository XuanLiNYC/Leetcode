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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode p1 = newhead;
        ListNode p2 = newhead;
        ListNode pre = newhead;
        int m = 0;
        
        while(m != n && p1 != null) {
            p1 = p1.next;
            m++;
        }
        if(m < n) {
            return(null);
        }
        
        while(p1!= null) {
            pre = p2;
            p1= p1.next;
            p2 = p2.next;
        }
        
        pre.next = p2.next;
        return(newhead.next);
        
        
    }
}