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
        if((head ==  null) ||(head.next == null)) {
            return(head);
        }
      ListNode newhead = new ListNode(-1);
      newhead.next = head;
      
      ListNode pre = newhead;
      ListNode cur = head ;
      ListNode next = null;
      ListNode node = null;
      
      while(cur.next != null) {
          next = cur.next;
          if(cur.val == next.val) {
              node = next;
             
          } else {
              if(node != null) {
                  pre.next = node.next ;
                  node = null;
              } else {
                       pre = cur; 
              }

          }
           cur = cur.next;

      }
      if(node != null) {
         pre.next = node.next ;
         node = null;
      }
      
      return(newhead.next);
      
        
    }
}