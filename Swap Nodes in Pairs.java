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
         if (( head == null ) || (head.next == null ))  {
          return ( head );
      }
      
      ListNode newhead = head.next;
      ListNode pre = null;
      ListNode cur = head;
      ListNode next = null;
      ListNode nextnext = null;
      
      while (( cur != null ) && (cur.next !=null )) {   // 这里有小错，把cur 写成head了，笨
          next=cur.next;
          nextnext= next.next;
          
          cur.next=nextnext;
          next.next=cur;
          if(pre != null) {
              pre.next = next;   
          }
          
          pre = cur;
          cur = nextnext;
  
      }
      
      return ( newhead );
    }
}