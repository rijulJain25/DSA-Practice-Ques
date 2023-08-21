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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode temp = root;
        TreeNode prev = root;
        while(temp != null){
            prev = temp;
            if(temp.val > val){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        if(prev.val > val){
            prev.left = new TreeNode(val);
        }
        else if(prev.val < val){
            prev.right = new TreeNode(val);
        }
        return root;
    }
}