/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head == null) {
            return null;
        }
        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);
        ListNode p = small, q = large;
        while(head != null) {
            if(head.val < x) {
                p.next = head;
                head = head.next;
                p = p.next;
                p.next = null;
            } else {
                q.next = head;
                head = head.next;
                q = q.next;
                q.next = null;
            }

        }
        p.next = large.next;
        return small.next;
    }
}
