public class Trees {
    

    public static class Node {
        int val;
        Node left;
        Node right;


        Node(int val) {
            this.val = val;
        }


    }

    // display method
    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val + " -> ");
        if(root.left != null) System.out.print(root.left.val + " -> ");
        if(root.right != null) System.out.print(root.right.val + " ->");
        System.out.println("null");


        display(root.left);
        display(root.right);
    }

    // inorder, preorder, postorder
    public static void inorderTraversal(Node root) {
        if( root == null) return;
        inorderTraversal(root.left); // LRootRight
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }


    // preorder
    public static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }


    // find the length of tree
    public static int length(Node root) {
        if(root == null) return 0;
        return 1 + length(root.left) + length(root.right);
    }


    // post order
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }


    // height
    public static int height(Node root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // print nth level
    public static void nthLevel(Node root, int n) {
        if(root == null) return;
        if(n == 1){
            System.out.println(root.val + " ");
            return;
        }

        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }


    public static void main(String[] args) {
       Node root = new Node(20); 
       Node a = new Node(15);
       Node b = new Node(25);

       root.left = a;
       root.right = b;
       Node c = new Node(10);
       Node d = new Node(13);
       Node e = new Node(30);

       a.left = c;
       a.right = d;
       b.right = e;

        display(root);
        inorderTraversal(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println("Sixe of Tree: " + length(root));
        System.out.println("Height of tree: " + height(root));

        int level = height(root) + 1;
        System.out.println(level);
    }
}
