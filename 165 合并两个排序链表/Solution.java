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
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l2 == null) {
            return l1;
        }
        if(l1 == null) {
            return l2;
        }
        ListNode head = new ListNode(-1);
        ListNode p = l1;
        ListNode q = l2;
        ListNode o = head;
        while(p != null && q != null) {
            if(p.val < q.val) {
                o.next = p;
                o = p;
                p = p.next;
            } else {
                o.next = q;
                o = q;
                q = q.next;
            }
        }
        while(p != null) {
            o.next = p;
            o = p;
            p = p.next;
        }
        while(q != null) {
            o.next = q;
            o = q;
            q = q.next;
        }
        return head.next;
    }
}
