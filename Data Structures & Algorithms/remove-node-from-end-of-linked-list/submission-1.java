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
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode left = dummy;
        ListNode right = head;

        int diff = n;
        while(diff>0)
        {
            right = right.next;
            diff--;
        }

        while(right != null)
        {
            left=left.next;
            right=right.next;
        }

        left.next=left.next.next;

        return dummy.next;

    }
}
