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
    public static void traversal(TreeNode root , int targetSum , int sum , List<List<Integer>> ll , List<Integer>al ){
        if(root == null){
            return;
        }

        al.add(root.val);
        sum += root.val;
        if(root.left == null && root.right == null){       // leaf node
            if(targetSum == sum){
                ll.add(new ArrayList<>(al));   
            }
        }
        traversal(root.left , targetSum , sum , ll , al);
        traversal(root.right , targetSum , sum  , ll , al);

        sum -= root.val;
        al.remove(al.size() -1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null){
            return ll;
        }
        List<Integer> al = new ArrayList<>();

        traversal(root , targetSum , 0 , ll , al);
        return ll;
    }
}
