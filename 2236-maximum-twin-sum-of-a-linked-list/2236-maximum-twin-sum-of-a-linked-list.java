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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = null;
        ListNode curr = head;

        while(curr != slow){
            ListNode temp = curr.next;
            curr.next = rev;
            rev = curr;
            curr = temp;
        }

        ListNode first = rev;
        ListNode second = slow;

        int maxSum = 0;
        while(first != null){
            maxSum = Math.max(maxSum, first.val + second.val);
            first = first.next;
            second = second.next;
        }

        return maxSum;

    }
}