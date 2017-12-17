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
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // 递归
        depth(root, 0);
        return maxDepth;
    }

    int maxDepth = 0;

    public void depth(TreeNode node, int depth) {
        if(depth > maxDepth) {
            maxDepth = depth;
        }
        if(node == null)
            return ;
        else {
            depth(node.left, depth + 1);
            depth(node.right, depth + 1);
        }
    }
}
