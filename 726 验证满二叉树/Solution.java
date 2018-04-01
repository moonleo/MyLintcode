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
     * @param root: the given tree
     * @return: Whether it is a full tree
     */
    public boolean isFullTree(TreeNode root) {
        // write your code here
        if(root.left == null && root.right == null) {
            return true;
        }
        if(root.left != null && root.right != null) {
            boolean left = isFullTree(root.left);
            boolean right = isFullTree(root.right);
            return left && right;
        }
        return false;
    }
}
