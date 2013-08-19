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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode head = merge(l1,l2);
        return(head);
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return(l2);
        }
        if(l2 == null) {
            return(l1);
        }
        
        ListNode head = new ListNode(0);
        ListNode newhead = head;
        
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
  
            } else {
                head.next = l2;
                l2 = l2.next;
                
            }
             head = head.next;
            
        }
        
        if(l1 == null) {
            head.next = l2;
        }
        
        if(l2 == null) {
            head.next = l1;
        }
        
        return(newhead.next);
        
        
        
    }
}