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

    public static int helper(TreeNode root, int arr[]){
        if(root == null){
            return 0;
        }
        int lf = Math.max(0, helper(root.left, arr));
        int rt = Math.max(0, helper(root.right, arr));
        arr[0] = Math.max(arr[0], lf+ rt+root.val);
        return root.val+Math.max(lf, rt);
    }

    public int maxPathSum(TreeNode root) {
        int arr[] = new int[1];
        arr[0] = Integer.MIN_VALUE;
        helper(root, arr);
        return arr[0];
    }
}