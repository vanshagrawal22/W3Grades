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
    public static int path(TreeNode root , int targetSum , long sum , HashMap<Long,Integer> hm){
        if(root == null){
            return 0;
        }

        sum += root.val;
        int currCount = 0;
        if(hm.containsKey(sum - targetSum)){
            currCount = hm.get(sum - targetSum);
        }

        hm.put(sum , hm.getOrDefault(sum , 0) + 1);

        int count1 = path(root.left , targetSum ,  sum , hm);
        int count2 = path(root.right , targetSum ,  sum , hm);

        hm.put(sum , hm.get(sum) - 1);

        System.out.println(currCount + count1 + count2 + " " + root.val );
        return currCount + count1 + count2;
    }
    public int pathSum(TreeNode root, int targetSum) {
        int count = 0;
        HashMap<Long,Integer> hm = new HashMap<>();
        hm.put(0l,1);
        return path(root , targetSum , 0 , hm);
    }
}
