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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode slow = head;
        ListNode fast = head;

        if (head.next == null || head == null)
            return head;
        for (int i = 1; i <= k && fast != null; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        while (k > 1) {
            first = first.next;
            k--;
        }
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }
}