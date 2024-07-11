/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
       
       ArrayList<Integer>a=new ArrayList<>();

        if(node==null){

            return a;

        }

        else{

            ArrayList<Integer>m=new ArrayList<>();

            Queue<Node>q=new LinkedList<>();

            q.add(node);

            while(!q.isEmpty()){

                int size=q.size();

                while(size!=0){

                    Node root=q.poll();

                    a.add(root.data);

                    if(root.left!=null){

                        q.add(root.left);

                    }

                    if(root.right!=null){

                        q.add(root.right);

                    }

                    size--;

                }

               m.addAll(0,a);

               a.clear();

            }

            return m;

        }
    }
}
