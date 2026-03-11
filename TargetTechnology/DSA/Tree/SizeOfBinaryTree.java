import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // preorder Traversal
    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Size of tree
    public static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // Sum of tree
    public static int sum(Node root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    // Height of tree
    public static int height(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Find node with max value
    public static int maxValue(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int a = root.val;
        int b = maxValue(root.left);
        int c = maxValue(root.right);

        return Math.max(a, Math.max(b, c));

    }

    // find the min value of tree
    public static int minValue(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.val, Math.min(minValue(root.left), minValue(root.right)));
    }

    // find the product of tree
    public static int product(Node root) {
        if (root == null)
            return 1;

        return root.val * product(root.left) * product(root.right);
    }

    // Traversal Order
    // preOrder
    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // InOrder Traversal
    public static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    // Post Order Traversal
    public static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    // print nth lever tree
    public static void nthLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

    // Breadth First Search(BFS) level
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }


    // Check is it Balanced tree or not
    public static boolean isBalanced(Node root) {
        if(root == null) return true;
        int lh = height(root.left);
        if(root.left != null) lh++;
        int rh = height(root.left);
        if(root.right != null) rh++;
        int d = lh - rh;
        if(d<0) d = -d;
        if(d>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }


    // Diameter of Binary Tree
    public static int diameter(Node root) {
        // if(root == null) return 0;

        // return 2 + height(root.left) + height(root.right);

        if(root == null || (root.left == null && root.right == null)) return 0;

        int leftAns = diameter(root.left);
        int rightAns = diameter(root.right);
        int mid = height(root.left) + height(root.left);
        if(root.left != null) mid++;
        if(root.right != null) mid++;
        
        int max = Math.max(leftAns, Math.max(rightAns, mid));

        return max;
    }



    // Same Tree
    public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
        b.right = e;
        Node f = new Node(7);
        e.left = f;

        preorder(root);
        System.out.println();
        System.out.println("Size of Binary Tree: " + size(root));

        System.out.println("Sum of tree: " + sum(root));

        System.out.println("Hieght of tree: " + height(root));

        System.out.println("Max.. Value of Tree: " + maxValue(root));

        System.out.println("Min Value of Tree: " + minValue(root));

        System.out.println("Product of Tree: " + product(root));

        // preOrder called
        preOrder(root);

        System.out.println();

        // inOrder Call
        inOrder(root);

        System.out.println();

        postOrder(root);
        System.out.println(

        );

        System.out.println("Nth Level Tree Element: ");
        nthLevel(root, 3);

        System.out.println();
        // using for loop find level
        int level = height(root) + 1;
        for (int i = 0; i <= level; i++) {
            nthLevel(root, i);
            System.out.println();
        }

        System.out.println();
        System.out.print("After BFS Traversal: ");
        bfs(root);

        System.out.println();
        System.out.print("Diameter of Tree: " + diameter(root));

        System.out.println();
        System.out.println(isBalanced(root));
        

    }
}
