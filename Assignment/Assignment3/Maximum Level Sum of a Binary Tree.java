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
    public static void levelOrder(TreeNode root , List<Integer>ll){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            int sum = 0;
            for(int i=0; i<size; i++){
                TreeNode node = q.remove();

                sum += node.val;

                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }
            }

            ll.add(sum);
            // System.out.println(ll);
        }
    }
    public int maxLevelSum(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        levelOrder(root , ll);

        int idx = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<ll.size(); i++){

            

            if(ll.get(i) > max){
                max = ll.get(i);
                idx = i+1;
                
            }
        }

        return idx;
    }
}
