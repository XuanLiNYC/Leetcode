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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if((k<=1) ||(head == null)) {
            return(head);
        }
        
       
        ListNode newhead = new ListNode(0);
        newhead.next = head ;
        ListNode pre = newhead;
        ListNode next = null ;
        
        int temp = 1;
        
        while(head!= null ) {
            if(temp == k) {
                next = head.next ;
                head.next = null;
               ListNode temphead = reverse(pre.next);
               ListNode temppre = pre.next;
               pre.next.next =next;
               pre.next = temphead;
               pre = temppre;
               head = next;
               temp = 0;
            } else {
                head = head.next;
            }
                  temp ++;
            
        }
        
        return(newhead.next);
        
        
    }
    
    public ListNode reverse(ListNode head) {
        
        if(head.next == null) {
            return(head) ;
            
        } else {
            ListNode newhead = reverse(head.next);
            head.next.next = head;
            head.next = null;
             return(newhead);
        }
    }
    
   
}