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

    public static boolean helper(TreeNode root, long maxi, long mini){
        if(root == null){
            return true;
        }
        if(root.val >= maxi || root.val <= mini){
            return false;
        }

        return helper(root.left, root.val, mini) && helper(root.right, maxi, root.val);
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
}