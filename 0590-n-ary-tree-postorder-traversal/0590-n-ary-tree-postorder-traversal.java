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
        if(root.children==null)
        {
            return ne;
        }
        for(Node child:root.children)
        {
            traverser(child);
            ne.add(child.val);
        }
        return ne;
    }
    List<Integer> ne=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null)
        {
            return ne;
        }
        traverser(root);
        ne.add(root.val);
        return ne;
    }
}