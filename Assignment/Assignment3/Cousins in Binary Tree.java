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
    TreeNode parentx=null;
    TreeNode parenty=null;
    int depthx=Integer.MIN_VALUE;
    int depthy=Integer.MIN_VALUE;
    public boolean isCousins(TreeNode root, int x, int y) {
        height(root,null,x,y,0);
        if (depthy==depthx && parentx!=parenty)
        return true;
        return false;
    }
    public void height(TreeNode root,TreeNode parent, int x,int y,int depth){
        if (root==null)
        return;
        if (root.val==x){
            parentx=parent;
            depthx=depth;
        }
        else if (root.val==y){
            parenty=parent;
            depthy=depth;
        }
        height(root.left,root,x,y,depth+1);
        height(root.right,root,x,y,depth+1);
    }
}
