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

    // public static int LengthOFll(ListNode l1){
    //     ListNode temp =l1;
    //     int count = 0;
    //     while(temp != null){
    //         count++;
    //         temp = temp.next;
    //     }
    //     return temp;
    // }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        // int maxLen = Math.max(LengthOFll(l1), )
        ListNode newHead = new ListNode();
        ListNode temp1 = newHead;
        while(l1 != null || l2 != null || carry ==1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;
            ListNode n = new ListNode(sum%10);
            temp1.next = n;
            temp1 = temp1.next;
        }

        return newHead.next;
    }
}