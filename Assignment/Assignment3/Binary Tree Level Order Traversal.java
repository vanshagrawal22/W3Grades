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
    public static void level(TreeNode root , List<List<Integer>> ll){
        if(root == null){
            return ;
        }

        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer>al = new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){

            TreeNode node = q.remove();

            if(node == null){
                ll.add(new ArrayList<>(al));
                al.clear();
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                continue;
            }

            al.add(node.val);

            if(node.left != null){
                q.add(node.left);
            }

            if(node.right != null){
                q.add(node.right);
            }


            
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();

        level(root , ll);
        return ll;
    }
}
