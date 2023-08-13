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

    public static TreeNode helper(int[] preorder, int preStr, int preEnd, int[] inorder, int inStr, int inEnd, Map<Integer, Integer> map){
        if(preStr > preEnd || inStr > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStr]);
        int inRoot = map.get(root.val);
        int numl = inRoot - inStr;

        root.left = helper(preorder, preStr+1, numl+preStr, inorder, inStr, inRoot -1, map);
        root.right = helper(preorder, numl+preStr+1, preEnd, inorder, inRoot+1, inEnd, map);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
    }
}