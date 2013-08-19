/**
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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function    
        if(lists.size() == 0) {
            return(null);
        }
        ListNode head = merge(lists);
        
        return(head);
    }
    
    public ListNode merge(ArrayList<ListNode> lists) {
        
        ListNode head =  new ListNode(0);
        ListNode newhead = head;
        PriorityQueue<ListNode>queue = new PriorityQueue<ListNode>(lists.size(),Order);
        for(int i = 0 ; i < lists.size(); i++){
            ListNode temp = lists.get(i);
            if(temp != null) {
                
             queue.offer(temp);               
            }

        }
        
        while(queue.size() > 0) {
            ListNode next = queue.poll();
            if(next.next != null) {
                queue.offer(next.next);
            }
            head.next = next;
            head = head.next;   
        }
        
        return(newhead.next);
    }
    
    public static final Comparator<ListNode> Order =  new Comparator<ListNode>() {
        // @override
        public int compare(ListNode o1, ListNode o2) {
            return(o1.val > o2.val ? 1 : (o1.val< o2.val ? -1 :0));
            
        }
        
    };
          
    
}