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
        if(n <= 0) {
            return(head);   
        }
        
        ListNode p1= head;
        ListNode p2 = head;
  
        int m = 0;
        
        while( p1!= null) {
            p1 = p1.next;
            m++;
            if(m == n)
            break;

        }
        
        // remove p2.next
        ListNode pre = null ;
        
        if(( m == n ) && (p1 != null)) {
            
            while(p1 != null){
                p1 = p1.next;
                pre = p2;
                p2 = p2.next;               
            }
            
             pre.next = pre.next.next;
           
            
        } else if (m == n){
            head = head.next;
        
        return(head);
        }  else {
            
            return(head);
        }
        
        return(head);
        
    }
}