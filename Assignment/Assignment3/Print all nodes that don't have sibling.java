ArrayList<Integer> noSibling(Node node)
    {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node curr = q.remove();
            
            if(curr.left == null && curr.right!=null){
                q.add(curr.right);
                ans.add(curr.right.data);
                
            }else if(curr.left != null && curr.right==null){
                q.add(curr.left);
                ans.add(curr.left.data);
                
            }else if(curr.left != null && curr.right!=null){
                q.add(curr.left);
                q.add(curr.right);
            }        
        }
        if(ans.size()==0){
            ans.add(-1);
            return ans;
        }
        Collections.sort(ans);

        return ans;
    
    }
