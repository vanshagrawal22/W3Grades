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
    public static boolean checkBalance(TreeNode root){
        if(root == null){
            return true;
        }

        boolean first = checkBalance(root.left);
        int h1 = height(root.left);

        if(first == false){
            return false;
        }

        boolean second = checkBalance(root.right);
        int h2 = height(root.right);

        if(Math.abs(h1 - h2) > 1){
            return false;
        }

        return first && second;
    }

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int h1 = height(root.left);
        int h2 = height(root.right);

        return Math.max(h1 , h2) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root );
    }
}
