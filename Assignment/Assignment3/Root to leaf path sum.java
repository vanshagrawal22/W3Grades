class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int s) {
        if(root == null)
            return true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, root.data));
        while(!q.isEmpty()){
            Node node = q.peek().node;
            int sum = q.peek().sum;
            q.poll();
            if(node.left!=null)
                q.add(new Pair(node.left, sum+node.left.data));
            if(node.right!=null)
                q.add(new Pair(node.right, sum+node.right.data));
            if((sum == s && node.left==null) && (sum == s && node.right==null))
                return true;
        }
        return false;
    }
