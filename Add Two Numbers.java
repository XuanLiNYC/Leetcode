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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(l1 != null && l2 != null) {
            int sum = l1.val+ l2.val+ carry;
            if(sum >=10) {
                carry =1;
                sum = sum%10;
            } else  {
                carry = 0;
            }
            ListNode node = new ListNode(sum);
            temp.next = node;
            temp = node;
            l1 = l1.next;
            l2 = l2.next ;
        }
        
        while(l1 != null) {
             int sum = l1.val+carry;
             if(sum >=10) {
                carry =1;
                sum = sum%10;
            } else  {
                carry = 0;
            }
             ListNode node = new ListNode(sum);
            temp.next = node;
            temp = node;
             l1 = l1.next;
        }
        
        while(l2 != null) {
             int sum = l2.val+carry;
             if(sum >=10) {
                carry =1;
                sum = sum%10;
            } else  {
                carry = 0;
            }
             ListNode node = new ListNode(sum);
            temp.next = node;
            temp = node;
             l2 = l2.next;
        }
        
        if(carry == 1){
             ListNode node = new ListNode(1);
             temp.next = node;
        }
        
        return(head.next);
    }
}