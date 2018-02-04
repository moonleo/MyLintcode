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
    /*
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = null, tail = null, tmp = null;
        int sum = 0, carry = 0;
        while(p != null && q != null) {
            sum = (p.val + q.val + carry) % 10;
            if(head == null) {
                head = new ListNode(sum);
                tail = head;
            } else {
                tmp = new ListNode(sum);
                tail.next = tmp;
                tail = tmp;
            }
            carry = (p.val + q.val + carry) / 10;
            p = p.next;
            q = q.next;
        }
        while(p != null) {
            sum = (p.val + carry)%10;
            tmp = new ListNode(sum);
            tail.next = tmp;
            tail = tmp;
            carry = (p.val + carry)/10;
            p = p.next;
        }
        while(q != null) {
            sum = (q.val + carry)%10;
            tmp = new ListNode(sum);
            tail.next = tmp;
            tail = tmp;
            carry = (q.val + carry)/10;
            q = q.next;
        }
        if(carry == 1) {
            tmp = new ListNode(carry);
            tail.next = tmp;
            tail = tmp;
        }
        return head;
    }
}
