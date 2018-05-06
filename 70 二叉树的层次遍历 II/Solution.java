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
     * @param root: A tree
     * @return: buttom-up level order a list of lists of integer
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        if(root != null) {
            nodes.add(root);
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            result.add(list);
        }
        while(!nodes.isEmpty()) {
            List<TreeNode> nextLevelNodes = new ArrayList<TreeNode>();
            List<Integer> nextLevelVal = new ArrayList<Integer>();
            for(TreeNode node: nodes) {
                if(node.left != null) {
                    nextLevelNodes.add(node.left);
                    nextLevelVal.add(node.left.val);
                }
                if(node.right != null) {
                    nextLevelNodes.add(node.right);
                    nextLevelVal.add(node.right.val);
                }
            }
            nodes = nextLevelNodes;
            if(!nextLevelVal.isEmpty())
                result.add(0, nextLevelVal);
        }
        return result;
    }
}
