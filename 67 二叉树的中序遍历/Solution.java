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
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        inorder(root);
        return result;
    }

    List<Integer> result = new ArrayList<Integer>();

    public void inorder(TreeNode root) {
        if(root == null) {
            return ;
        }
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
}
