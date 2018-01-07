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
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        level(root);
        return result;
    }

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public void level(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(node != null) {
            queue.add(node);
        }
        List<Integer> levelList;
        while(!queue.isEmpty()) {
            int length = queue.size();
            levelList = new ArrayList<Integer>();
            while(length > 0) {
                TreeNode t = queue.poll();
                levelList.add(t.val);
                if(null != t.left) {
                    queue.add(t.left);
                }
                if(null != t.right) {
                    queue.add(t.right);
                }
                length --;
            }
            result.add(levelList);
        }
    }
}
