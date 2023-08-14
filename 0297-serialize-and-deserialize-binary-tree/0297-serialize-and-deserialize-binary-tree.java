/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        Queue<TreeNode> que = new LinkedList<>();
        StringBuilder res= new StringBuilder();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode node = que.poll();
            if(node == null){
                res.append("null ");
                continue;
            }
            res.append(node.val +" ");
            que.add(node.left);
            que.add(node.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == ""){
            return null;
        }
        Queue<TreeNode> que = new LinkedList<>();
        String dt[] = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(dt[0]));
        que.add(root);
        for(int i = 1; i<dt.length; i++){
            TreeNode node = que.poll();
            if(!dt[i].equals("null")){
                TreeNode leftN = new TreeNode(Integer.parseInt(dt[i]));
                node.left = leftN;
                que.add(leftN);
            }
            if(!dt[++i].equals("null")){
                TreeNode rightN = new TreeNode(Integer.parseInt(dt[i]));
                node.right = rightN;
                que.add(rightN);
            }
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));