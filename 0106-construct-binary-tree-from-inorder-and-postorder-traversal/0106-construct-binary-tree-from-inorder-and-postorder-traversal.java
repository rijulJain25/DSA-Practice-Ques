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

    public static TreeNode helper(int inorder[], int inStr, int inEnd, int postorder[], int postStr, int postEnd, Map<Integer, Integer> map){
        if(inStr > inEnd || postStr > postEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = map.get(root.val);
        int numl = inRoot-inStr;
        root.left = helper(inorder, inStr, inRoot-1, postorder, postStr, postStr + numl -1, map);
        root.right = helper(inorder, inRoot+1, inorder.length-1, postorder, postStr + numl , postEnd-1, map);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }
}