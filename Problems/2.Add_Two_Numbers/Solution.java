/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = l1;
        ListNode res = null;
        ListNode temp = l1;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int n = 0;
            int m = 0;
            if (l1 != null) {
                n = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                m = l2.val;
                l2 = l2.next;
            }
            carry += (n + m);
            if (temp == null) {
                temp = new ListNode(carry % 10);
                res.next = temp;
            } else {
                temp.val = carry % 10;
            }
            res = temp;
            temp = temp.next;
            carry /= 10;
        }
        return ans;
    }
}