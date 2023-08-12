/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 import java.util.*;
class Solution {

    public static void ParentTrack(TreeNode root, Map<TreeNode, TreeNode> m){
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode curr = que.poll();
            if(curr.left !=null){
                m.put(curr.left, curr);
                que.add(curr.left);
            }
            if(curr.right !=null){
                m.put(curr.right, curr);
                que.add(curr.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        ParentTrack(root, parent);
        Queue<TreeNode> que = new LinkedList<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();
        que.add(target);
        visited.put(target, true);
        int currDis = 0;
        while(!que.isEmpty()){
            int size = que.size();
            if(currDis == k){
                break;
            }
            currDis++;
            for(int i = 0; i<size; i++){
                TreeNode curr = que.poll();
                if(curr.left != null && visited.get(curr.left) == null){
                    que.add(curr.left);
                    visited.put(curr.left, true);
                }
                if(curr.right != null && visited.get(curr.right) == null){
                    que.add(curr.right);
                    visited.put(curr.right, true);
                }
                if(parent.get(curr) != null && visited.get(parent.get(curr)) == null){
                    que.add(parent.get(curr));
                    visited.put(parent.get(curr), true);
                }
            }
        }
        List<Integer> list= new ArrayList<>();
        while(!que.isEmpty()){
            TreeNode nodes = que.poll();
            list.add(nodes.val);
        }
        return list;
    }
}