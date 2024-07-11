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
    public static TreeNode formTree(int []nums , int si , int ei ){ 
        if(si > ei){
            return null;
        }
        
        int mi = si + (ei - si)/2;
        // System.out.println(nums[mi]);

        TreeNode root = new TreeNode(nums[mi]);

        root.left = formTree(nums , si , mi -1);
        root.right = formTree(nums , mi +1 , ei);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int stIdx = 0;
        int eIdx = nums.length -1;

        return formTree(nums , stIdx , eIdx );
    }
}
