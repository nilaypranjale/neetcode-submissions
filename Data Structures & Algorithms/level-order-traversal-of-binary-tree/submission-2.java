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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root==null) return res;
        Queue<TreeNode> bfs = new ArrayDeque();
        bfs.offer(root);

        while(!bfs.isEmpty())
        {
            List<Integer> level = new ArrayList();
            int nodesinlevel = bfs.size();
            for(int i = nodesinlevel; i > 0; i--)
            {
                TreeNode curr = bfs.poll();
                if(curr!=null)
                {
                    level.add(curr.val);
                    if(curr.left != null)
                        bfs.offer(curr.left);
                    if(curr.right != null)
                        bfs.offer(curr.right);
                }
            }
            if(level.size()>0)
            {
                res.add(level);
            }
        }
        return res;
    }
}
