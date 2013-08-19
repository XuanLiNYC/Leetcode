/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = 0;
        ListNode temphead = head;
        while(temphead!=null){
            temphead=temphead.next;
            n++;
        }
        if(n == 0){
            return(null);
        }
        tempNode=head;
    
        TreeNode returnnode = convert( 0,n-1);
        return(returnnode);
    }
    
    public ListNode tempNode; 
    
    public TreeNode convert( int start, int end) {
        int mid = (start+end)/2;
   
     
        if(start > end) {
            return(null);
        }
        
        TreeNode left = convert( start, mid-1);
       
        TreeNode parent= getNext();
        
         parent.left = left;
        
  
        TreeNode  right = convert( mid+1, end);
        
         parent.right = right;
   
        
        return(parent);
    }
    
    public TreeNode getNext(){
        if(tempNode!=null) {
            TreeNode newnode = new TreeNode(tempNode.val);
            tempNode = tempNode.next;
            return(newnode);  
        } else {
               return(null);
        }
     
    }

}
    
   