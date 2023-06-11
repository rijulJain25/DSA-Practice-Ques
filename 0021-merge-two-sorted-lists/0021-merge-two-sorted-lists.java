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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
         if(list2 == null){
            return list1;
        }

        ListNode newNode = null;
        if(list1.val < list2.val){
            newNode = list1;
        }else{
            newNode = list2;   
        }

        ListNode nextNode = newNode;
        while(list1 != null && list2 != null){
            ListNode temp = null;
            if(list1.val < list2.val){
                temp = list1;
                list1 = list1.next;
            }else{
                temp = list2;
                list2 = list2.next;
            }
            nextNode.next = temp;
            nextNode = temp;
        }

        if(list1 != null){
            nextNode.next = list1;
            list1 = list1.next;
        }else if(list2 != null){
            nextNode.next = list2;
            list2 = list2.next;
        }
        return newNode;
    }
}