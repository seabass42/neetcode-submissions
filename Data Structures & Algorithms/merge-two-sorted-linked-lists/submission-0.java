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
        if (list1 == null && list2 == null) return null;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode ans = curr1;
        
        if (curr1 == null || (curr2 != null && curr2.val < curr1.val)){
            ans = curr2;
            curr2 = curr2.next;
        } else {
            curr1 = curr1.next;
        }
        ListNode head = ans; 
        while (curr1 != null || curr2 != null){
            if (curr1 == null || (curr2 != null && curr2.val < curr1.val)){
                ans.next = curr2;
                ans = ans.next;
                curr2 = curr2.next;
            } else {
                ans.next = curr1; 
                ans = ans.next;
                curr1 = curr1.next;
            }
        }
        return head;
    }
}