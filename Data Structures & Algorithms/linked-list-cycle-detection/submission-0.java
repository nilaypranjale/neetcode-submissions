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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> ls = new HashSet();

        int sz = ls.size();
        while(head != null)
        {
            ls.add(head);
            if(sz==ls.size())
            {
                return true;
            }
            sz=ls.size();
            head=head.next;
        }
        return false;
    }
}
