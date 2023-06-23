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

    public static int LengthOfLL(ListNode head){
        int length = 0;
        while(head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        int length = LengthOfLL(head);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode curr;
        ListNode nex;

        while(length >= k){
            curr = prev.next;
            nex = curr.next;
            for(int i = 1; i<k; i++){
                curr.next = nex.next;
                nex.next= prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            prev = curr;
            length -= k;
        }
        return dummyHead.next;
    }
}