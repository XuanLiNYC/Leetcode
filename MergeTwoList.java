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
        if ( l1==null) {
            return(l2);
        }
        if (l2==null) {
            return (l1);
        }
        
        ListNode head= ( l1.val <= l2.val ) ? l1: l2;
        ListNode p = head;
        if( head == l1 ) {
            
           l1 = l1.next;  
        } 
        else {
        
        l2  = l2.next ;
        }
        
        
        while ( l1 !=null && l2 != null) {
            
            ListNode next = ( l1.val <= l2.val ) ? l1: l2 ;
            if (next == l1 ) {
              l1 =l1.next ;
            } else {
            
            l2= l2.next ;
            }
            p.next= next;
            p = p.next;
        }
        
        if ( l1== null)
        p.next = l2 ;
        
        if ( l2 == null)
        p.next =l1 ;
        
        return( head ) ;
    }
}