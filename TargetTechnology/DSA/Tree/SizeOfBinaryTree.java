public class SizeOfBinaryTree {

    


    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }


    // preorder Traversal
    public static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }



    // Size of tree
    public static int size(Node root) {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }


    // Sum of tree
    public static int sum(Node root) {
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    // Height of tree
    public static int height(Node root) {
        if(root == null) return 1;

        return 1 + height(root.left) + height(root.right);
    }


    // Find node with max value
    public static int maxValue(Node root) {
        if(root == null) return 0;

        int a = root.val;
        int b = maxValue(root.left);
        int c = maxValue(root.right);


        return Math.max(a, Math.max(b,c));
        
    }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.left = e;


        preorder(root);
        System.out.println();
        System.out.println("Size of Binary Tree: " + size(root));


        System.out.println("Sum of tree: " + sum(root));


        System.out.println("Hieght of tree: " + height(root));


        System.out.println("Max.. Value of Tree: " + maxValue(root));

    }
}
