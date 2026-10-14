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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        Queue<TreeNode> bfs = new ArrayDeque();
        Queue<Integer> pq = new PriorityQueue();

        bfs.offer(root);
        while(!bfs.isEmpty())
        {
            TreeNode curr = bfs.poll();
            pq.offer(curr.val);
            if(curr.left != null) bfs.offer(curr.left);
            if(curr.right != null) bfs.offer(curr.right);
        }
        while(!pq.isEmpty() && k>1)
        {
            // System.out.println();
            pq.poll();
            k--;
        }
        return pq.isEmpty()? 0: pq.poll();
    }
}
