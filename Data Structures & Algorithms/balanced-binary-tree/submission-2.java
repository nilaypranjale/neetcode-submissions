/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int getHeight(TreeNode node)
    {
        if(node==null)
            return 1;

        return 1 + Math.max(getHeight(node.left),getHeight(node.right));
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int diff = getHeight(root.left)-getHeight(root.right);

        if(Math.abs(diff)>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
