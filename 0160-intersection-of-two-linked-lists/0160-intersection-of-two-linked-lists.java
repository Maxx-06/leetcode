/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode max = headA;
        ListNode smith = headB;

        while (max != smith) {

            if (max == null) {
                max = headB;
            } else {
                max = max.next;
            }

            if (smith == null) {
                smith = headA;
            } else {
                smith = smith.next;
            }
        }

        return max;
    }
}