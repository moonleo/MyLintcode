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
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        makeString(root, sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append("}");
        return sb.toString();
    }

    public void makeString(TreeNode root, StringBuilder sb) {
    	if(root == null) {
    		sb.append("#,");
    	} else {
    		sb.append(root.val).append(",");
    		makeString(root.left, sb);
    		makeString(root.right, sb);
    	}
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        String tree = data.substring(1, data.length()-1);
        String[] arr = tree.split(",");
        TreeNode root = null;
        root = makeTree(root, arr);
        return root;
    }
    int index = 0;
    public TreeNode makeTree(TreeNode root, String[] arr) {
    	if(index >= arr.length || arr[index].equals("#")) {
    		return null;
    	}
    	TreeNode node = new TreeNode(Integer.parseInt(arr[index]));
    	index ++;
    	node.left = makeTree(node.left, arr);
    	index ++;
    	node.right = makeTree(node.right, arr);
    	return node;
    }
}
