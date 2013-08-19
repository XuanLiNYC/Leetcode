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

import java.util.PriorityQueue;
import java.util.Comparator;
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode newhead =  new ListNode(0);
        ListNode head = newhead;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(10,ORDER);  // 这里注意要加上数字先
        if(lists == null){
            return(null);
        }
        
       int size = lists.size();
       
       if(size == 0){
           return(null);
       }

       int[] p = new int[size];
       for(int i = 0 ; i <  size ; i++) {
           ListNode tempnode = lists.get(i);
           if(tempnode != null){
           queue.add(tempnode);               
           }
       }
       
       while(!queue.isEmpty()) {
           ListNode top = queue.peek();
           head.next = top;
           head = head.next;
           ListNode next = top.next;
           queue.poll();
           if(next != null) {
               queue.add(next);
           }           
       }
       
       return(newhead.next);
        
        
    }
    

   // 这里要注意写法啊
    static Comparator<ListNode> ORDER = new Comparator<ListNode>() {
        public int compare(ListNode n1, ListNode n2) {
            if( n1.val > n2.val) {
                return(1);
            } else if (n1.val < n2.val){
                return(-1);
            } else {
                return(0);
            }
        }
    };
}