
 // Definition for singly-linked list.

public class Solution {
	public static void main(String[] args) {
	ListNode n1 = new ListNode(1);
	ListNode n2 = new ListNode(2);
	n1.next = n2;
	reverseKGroup(n1, 2);

	}

    public static ListNode reverseKGroup(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(k<=1) {
            return(head);
        }
        
        
        ListNode preone = null;
        ListNode one = null;
        ListNode knode = null;

        ListNode preknode = null;
        
        ListNode newhead = head ;
        int temp = 1;
        
        while(head!=null){
            if(temp == k-1){
                preknode = head;
            }
            
            if(temp == 1) {
                one = head ;
            }
            if(temp == k) {
                knode =  head ;
                ListNode tempnode = one.next;
                one.next = knode.next;
                knode.next = tempnode;
                
                if(preone == null) {
                    newhead = knode;
                    preknode.next = one; 
                } else {
                    preone.next = knode;
                    preknode.next = one;    
                }
                
                temp =0;     
                preone = one;
                head = one;
                preknode = null;
                knode = null;
            }
    
            temp++;
            head = head.next;
			System.out.println(head.val);
            
        }
        return(newhead);
    }
    
    public static  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}