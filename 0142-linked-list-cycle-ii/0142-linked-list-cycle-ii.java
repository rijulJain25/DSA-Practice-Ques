import java.io.*;
import java.util.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                System.gc();
                return slow;
            }
        }
        System.gc();
        return null;

    }
}




