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
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        LinkedList<Integer> list = new LinkedList<Integer>();
        depthFirst(root, target, list);
        return result;
    }

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public void depthFirst(TreeNode node, int target, LinkedList<Integer> list) {
        if(node == null) {
            return ;
        }
        list.add(node.val);
        if(node.left == null && node.right == null && node.val == target) {
            List<Integer> list1 = new ArrayList<Integer>();
            for(Integer i: list) {
                list1.add(i);
            }
            result.add(list1);
        } else {
            depthFirst(node.left, target - node.val, list);
            depthFirst(node.right, target - node.val, list);
        }
        list.removeLast();
    }
}
