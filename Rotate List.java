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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if((head == null) ||(n == 0) ||(head.next == null)) {
            return(head);
        }
        
        ListNode temp = head;
        int k = 1 ; 
        
        while(temp.next != null) {
            k ++;
            temp = temp.next;
        }
        temp.next = head;
        int m =k- n%k;
        
        while(m > 1) {
            head = head.next;
            m--;
        }
        
        ListNode newhead = head.next;
        head.next = null;
        return(newhead);
        

        
    }
}