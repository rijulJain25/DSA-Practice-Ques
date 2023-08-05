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
 import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<TreeNode>();
        List<List<Integer>> list= new ArrayList<>();
        if(root == null){
            return list;
        }
        que.add(root);
        while(!que.isEmpty()){
            int level = que.size();
            List<Integer> subl = new ArrayList<>();
                for(int i = 0; i<level; i++){
                    if(que.peek().left != null){
                    que.add(que.peek().left);
                }
                if(que.peek().right != null){
                    que.add(que.peek().right);
                }

                subl.add(que.remove().val);
            }
            list.add(subl);
        }
        return list;
    }
}