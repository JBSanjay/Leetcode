/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   public List<Integer> traverser(Node root)
    {
       for(Node child:root.children)
       {
           lst.add(child.val);
           traverser(child);
       }
       return lst;
    }
    List<Integer> lst=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)
        {
            return lst;
        }
        lst.add(root.val);
        traverser(root);
        return lst;
    }
}