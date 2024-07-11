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
    public static void levelOrder(TreeNode root , List<List<Integer>> ll){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        List<Integer> al = new ArrayList<>();
        boolean leftToRight = true;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                TreeNode node = q.remove();
                al.add(node.val);

                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }

            }
            
            if(leftToRight){
                ll.add(new ArrayList<>(al));
                
            }else{
                Collections.reverse(al);
                ll.add(new ArrayList<>(al));
            }

            al.clear();
            leftToRight = !leftToRight;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
    
        levelOrder(root , ll);
        return ll;
    }
}
