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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        if(m == n) {
            return(newhead.next);
        }
        ListNode next = null;
        ListNode pre = newhead;
        ListNode M = null;
        ListNode N = null;
        int num = 1;
        
        while (num <= n) {
            if(num == m-1) {
                pre = head;     
            } else if (num == m) {
                M = head;
            } else if(num == n ) {
                N= head;
                next = head.next;
            }
            head = head.next;
            num++;
        }
        
        N.next = null;
        ListNode temphead = reverse(M);
        pre.next = temphead;
        
        while(temphead.next != null) {
            temphead = temphead.next;
        }
        temphead.next = next;
    
    return(newhead.next);
    
        
        
    }
    
    public ListNode reverse(ListNode M) {
        if(M.next == null) {
            return(M);
        } else {
            ListNode newhead = reverse(M.next);
            M.next.next = M;
            M.next = null;
            return(newhead);
        }
    }
    
}