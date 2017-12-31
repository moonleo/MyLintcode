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
    /*
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null) {
            return head;
        }
        ListNode p = head, q = p.next;
        while(q != null) {
            if(p.val == q.val) {
                q = q.next;
            } else {
                if(p.next != q) {
                    p.next = q;
                }
                p = q;
                q = p.next;
            }
        }
        p.next = null;
        return head;
    }
}
