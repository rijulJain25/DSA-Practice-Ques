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

    public ListNode reverseLL(ListNode ptr){
        ListNode pre=null;
        ListNode nex=null;
        while(ptr!=null) {
            nex = ptr.next;
            ptr.next = pre;
            pre=ptr;
            ptr=nex;
        }
        return pre;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseLL(slow.next);
        slow = slow.next;
        ListNode dummy = head;

        while(slow != null){
            if(slow.val != dummy.val){
                return false;
            }
            slow= slow.next;
            dummy = dummy.next; 
        }
        return true;
    }
}



