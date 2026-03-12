public class InvertBinaryTree {


    public static class Node{
        int val;
        Node left;
        Node right;


        public Node(int val) {
            this.val = val;
        }

    }

    // Invert Binary Tree
    public Node invertTree(Node root) {
        if(root == null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }

    // Symmetric Tree
    


   
    

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;


        
    }
}
