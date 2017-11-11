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
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        /*原地反转链表*/
        if(head == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = p.next;
        p.next = null;
        ListNode tmp;
        while(q != null) {
            tmp = q;
            q = q.next;
            tmp.next = p;
            p = tmp;
        }
        return p;

    }
}
