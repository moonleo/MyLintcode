/**
 * Definition for ListNode
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
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if(head == null) {
            return head;
        }
        ListNode root = head;
        while(root != null && root.val == val) {
            root = root.next;
        }
        ListNode p = root;
        ListNode q = p;
        while(p != null) {
            q = p.next;
            while(q!= null && q.val == val) {
                q = q.next;
            }
            p.next = q;
            p = p.next;
        }
        return root;
    }
}
