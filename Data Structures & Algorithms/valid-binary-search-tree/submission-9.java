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
    private boolean checkValid(TreeNode node, long lbound,long rbound)
    {
        if(node==null) return true;

        if(!(lbound<node.val && node.val<rbound))
            return false;

        return checkValid(node.left,lbound, node.val) && checkValid(node.right, node.val, rbound);
    }
    public boolean isValidBST(TreeNode root) {
        return checkValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
