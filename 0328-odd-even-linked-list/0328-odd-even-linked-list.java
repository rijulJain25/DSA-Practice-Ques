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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pt1 = head;
        ListNode pt2 = head.next;
        ListNode pt = pt2;
        while(pt2 != null && pt2.next != null ){
            pt1.next = pt1.next.next;
            pt2.next = pt2.next.next;
            pt1 = pt1.next;
            pt2 = pt2.next;
        }
        pt1.next = pt;
        return head;
    }
}