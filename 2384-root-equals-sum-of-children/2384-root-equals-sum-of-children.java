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
    public boolean checkTree(TreeNode root) {
        int leftSum = 0; int rightSum = 0;
        if(root == null || root.left == null || root.right == null){
            return true;
        }
        if(root.left != null){
            leftSum = root.left.val;
        }
        if(root.right != null){
            rightSum = root.right.val;
        }
        if(root.val == leftSum + rightSum && checkTree(root.left) && checkTree(root.right)){
            return true;
        }else{
            return false;
        }
    }
}