/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, max;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int max) {
 *         this.start = start;
 *         this.end = end;
 *         this.max = max
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of segment tree.
     * @param start: start value.
     * @param end: end value.
     * @return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
        int left = root.start;
        int right = root.end;
        if(start <= left && end >= right) {
            return root.max;
        }
        int mid = (left + right) / 2;
        if(end <= mid) {
            return query(root.left, start, end);
        }
        else if(start <= mid) {
            return max(query(root.left, start, mid), query(root.right, mid + 1, end));
        } else {
            return query(root.right, start, end);
        }
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
