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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val == p.val || root.val == q.val)
            return root; 

        if(p.val>q.val)
        {
            TreeNode temp = p;
            p=q;
            q=temp;
        }
        if(root.val > p.val && root.val < q.val)
            return root;
        
        TreeNode res=p;

        if(root.val < p.val && root.val < q.val)
            res = lowestCommonAncestor(root.right,p,q);
        else
            res = lowestCommonAncestor(root.left,p,q); 
        return res;
    }
}
