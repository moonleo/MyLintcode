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
    /*
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null) {
            return node;
        }
        if(node == null) {
            return root;
        }
        TreeNode node1 = searchForinsertNode(root, node);
        if(node1.val > node.val) {
            node1.left = node;
        } else if(node1.val < node.val) {
            node1.right = node;
        }
        return root;
    }

    private TreeNode searchForinsertNode(TreeNode root, TreeNode node) {
        if(root != null) {
            if(root.val > node.val) {
                return root.left == null ? root : searchForinsertNode(root.left, node);
            } else if(root.val < node.val) {
                return root.right == null ? root : searchForinsertNode(root.right, node);
            }
        }
        return null;
    }
}
