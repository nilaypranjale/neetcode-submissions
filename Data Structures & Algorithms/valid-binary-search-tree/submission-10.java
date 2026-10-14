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
    private boolean checkBst(TreeNode node, long low, long high)
    {
        if(node==null) return true;
        if(!(node.val>low && node.val<high)) return false;
        return checkBst(node.left,low,node.val) && 
        checkBst(node.right,node.val,high);
    }
    public boolean isValidBST(TreeNode root) {
        return checkBst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
