/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree
     * @return: An integer
     */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return minDepth(root, 0);
    }

    private int minDepth(TreeNode root, int depth) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        if(root.left == null && root.right == null) {
            return depth + 1;
        }
        return min(minDepth(root.left, depth + 1), minDepth(root.right, depth + 1));
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }
}
