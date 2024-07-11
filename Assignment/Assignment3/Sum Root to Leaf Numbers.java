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
    int total = 0;
    public int sumNumbers(TreeNode root) {
        // String s = "";
        calcSum(root, 0);
        return total;
    }
    
    public void calcSum(TreeNode root,int sum){
        if(root == null){
            return;
        }
        sum = sum * 10 + root.val;

        if(root.right == null && root.left == null){
            total+=sum;
        }else{
        calcSum(root.left, sum);
        calcSum(root.right,sum);
        }

    }

}
