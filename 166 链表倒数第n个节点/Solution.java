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
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list.
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if(head == null) {
            return null;
        }
        ListNode pre = head, post = head;
        int k = n;
        while(k > 0) {
            if(post == null) {
                return null;
            }
            post = post.next;
            k --;
        }
        while(post != null) {
            pre = pre.next;
            post = post.next;
        }
        return pre;
    }
}
