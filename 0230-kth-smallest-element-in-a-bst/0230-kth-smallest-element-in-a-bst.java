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

    public static TreeNode helper(TreeNode root, int k[]){
        if(root== null){
            return root;
        }

        TreeNode leftAns = helper(root.left, k);
        if(leftAns != null){
            return leftAns;
        }
        k[0]--;
        if(k[0] == 0){
            return root;
        }
        return helper(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        int arr[] = new int[]{k};
        TreeNode ans = helper(root, arr);
        return ans.val;
    }
}