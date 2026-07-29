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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0){
            if (head.next == null){
                return null;
            }
            head = head.next; 
            return head;
        }

        int sizeList = 0;
        ListNode curr = head;
        while (curr != null){
            sizeList++;
            curr = curr.next;
        }
        if (sizeList == 1) return null;
        int numIterations = sizeList - n;
        if (numIterations == 0){
            ListNode temp = head.next;
            head.next = null;
            head = temp;
            return head;
        }
        ListNode prev = null;
        curr = head;
        for (int i = 0; i < numIterations; i++){
            prev = curr;
            curr = curr.next;
        }
        if (curr.next == null){
            if (prev != null){
                prev.next = null;
            } else return null;
        }
        prev.next = curr.next;
        return head;
    }
}
