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

    public static TreeNode parentTrack(TreeNode root, Map<TreeNode, TreeNode> map, int start){
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        TreeNode res = new TreeNode(-1);
        while(!que.isEmpty()){
            TreeNode node = que.poll();
            if(node.val == start){
                res = node;
            }
            if(node.left != null){
                que.add(node.left);
                map.put(node.left, node);
            }
            if(node.right != null){
                que.add(node.right);
                map.put(node.right, node);
            }
        }
        return res;
    }

    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        TreeNode res = parentTrack(root, map, start);
        Queue<TreeNode> que = new LinkedList<>();
        que.add(res);
        Map<TreeNode, Boolean> m = new HashMap<>();
        m.put(res, true);
        int maxi = 0;
        while(!que.isEmpty()){
            int size = que.size();
            int cnt = 0;
            for(int i =0; i<size; i++){
                TreeNode curr = que.poll();
                if(curr.left != null && m.get(curr.left) == null){
                    que.add(curr.left);
                    cnt = 1;
                    m.put(curr.left, true);
                }
                if(curr.right != null && m.get(curr.right) == null){
                    que.add(curr.right);
                    cnt = 1;
                    m.put(curr.right, true);
                }
                if(map.get(curr) != null && m.get(map.get(curr)) == null){
                    que.add(map.get(curr));
                    cnt = 1;
                    m.put(map.get(curr), true);
                }
            }
            if(cnt == 1){
                maxi++;
            }
        }
        return maxi;
    }
}