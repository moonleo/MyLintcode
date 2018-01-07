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
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        postorder(root);
        return result;
    }

    List<Integer> result = new ArrayList<Integer>();

    public void postorder(TreeNode root) {
        if(root == null) {
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        result.add(root.val);
    }
}
