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
     * @param root: param root: The root of the binary search tree
     * @param k1: An integer
     * @param k2: An integer
     * @return: return: Return all keys that k1<=key<=k2 in ascending order
     */
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        search(root, k1, k2);
        return list;
    }

    List<Integer> list = new ArrayList<Integer>();
    public void search(TreeNode root, int k1, int k2) {
        if(root == null) {
            return ;
        }
        if(root.val < k1) {
            search(root.right, k1, k2);
        } else if(root.val > k2) {
            search(root.left, k1, k2);
        } else {
            search(root.left, k1, k2);
            list.add(root.val);
            search(root.right, k1, k2);
        }

    }
}
