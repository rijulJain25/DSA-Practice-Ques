/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static ListNode mergeList(ListNode l1, ListNode l2){
        ListNode fh = null; ListNode ft = null;
        while(l1 != null && l2!= null){
            if(fh == null && ft == null){
                if(l1.val < l2.val){
                    fh = l1;
                    ft = l1;
                    l1 = l1.next;
                }else{
                    fh = l2;
                    ft = l2;
                    l2 = l2.next;
                }
            }
            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    ft.next = l1;
                    ft = ft.next;
                    l1 = l1.next;
                }else{
                    ft.next = l2;
                    ft = ft.next;
                    l2 = l2.next;
                }
            }
        }
        if(l1!=null){
            ft.next=l1;
        }
        if(l2!=null){
            ft.next=l2;
        }
    
        return fh;

    }

    public ListNode sortList(ListNode head) {
         if(head == null || head.next == null)
            return head;
        
        
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;
        
        //middle of linked list
        while(fast !=  null && fast.next != null){
            temp = slow;
            slow = slow.next;          
            fast = fast.next.next;  
            
        }   
        temp.next = null;            
        
        ListNode l1 = sortList(head);  //2   
        ListNode l2 = sortList(slow);  //1 
        
        return mergeList(l1, l2);         
            
    }
}