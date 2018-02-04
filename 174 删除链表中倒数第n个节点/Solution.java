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
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if(head == null) {
            return head;
        }
        int k = n;
        ListNode pre = head, post = head;
        while(k >= 0) {
            if(post == null) {
                return head.next;
            }
            post = post.next;
            k --;
        }
        while(post != null) {
            pre = pre.next;
            post = post.next;
        }
        ListNode tmp = pre.next;
        pre.next = tmp.next;
        return head;
    }
}
