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

    public static void inOrder(TreeNode root, int count[]){
        if(root == null){
            return;
        }
        count[0]++;
        inOrder(root.left, count);
        inOrder(root.right, count);
    }

    public int countNodes(TreeNode root) {
        int count[] = new int[1];
        inOrder(root, count);
        return count[0];
    }
}