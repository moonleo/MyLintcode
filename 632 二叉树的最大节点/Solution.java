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
    int max = Integer.MIN_VALUE;
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if(null == root) {
            return null;
        }
        if(root.val > max) {
            max = root.val;
        }
        TreeNode left = maxNode(root.left);
        TreeNode right = maxNode(root.right);
        return max(root, left, right);
    }

    private TreeNode max(TreeNode a,TreeNode b,TreeNode c) {
        return max(a, max(b, c));
    }

    private TreeNode max(TreeNode a, TreeNode b) {
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        return a.val > b.val ? a : b;
    }
}
