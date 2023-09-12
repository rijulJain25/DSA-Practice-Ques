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
    public int goodNodes(TreeNode root) {
        return util1(root);
    }
    int ans = 0;

    public int util1(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return ans;
    }

    public void dfs(TreeNode root, int maxNode) {
        if (root == null) {
            return;
        }
        maxNode = Math.max(maxNode, root.val);
        if (root.val >= maxNode) {
            ans++;
        }
        dfs(root.left, maxNode);
        dfs(root.right, maxNode);
    }

}

