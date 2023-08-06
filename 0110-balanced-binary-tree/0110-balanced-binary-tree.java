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

    public static int helper(TreeNode root){
        if(root == null){
            return 0;
        }

        int lf = helper(root.left);
        if(lf == -1) return -1;
        int rt = helper(root.right);
        if(rt == -1) return -1;
        if(Math.abs(lf-rt)>1){
            return -1;
        }
        return 1+ Math.max(lf, rt);
    }

    public boolean isBalanced(TreeNode root) {
        return helper(root) == -1 ? false: true;
    }
}