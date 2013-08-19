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
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode cur = head ;
        ListNode next = null;
        
        if ((head == null) || (head.next == null)) {
            return(head);
        }
        
        while(cur.next != null) {
            next  = cur.next;
     
            if(cur.val == next.val) {
                cur.next = next.next ;
            } else {
                cur = cur.next ;
            }
        }
        
        return(head);
    }
}