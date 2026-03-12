public class InvertBinaryTree {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    // height of tree
    public static int height(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Invert Binary Tree
    public Node invertTree(Node root) {
        if (root == null)
            return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }

    // Symmetric Tree

    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSymmetric(Node root) {
        if (root == null)
            return true;
        root.left = invertTree(root.left);
        return isSameTree(root.left, root.right);
    }

    // Zigzag Level Order Traversal
    public static void zigzagLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.println(root.val + " ");
            return;
        }
        zigzagLevel(root.right, n - 1);
        zigzagLevel(root.left, n - 1);
    }

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

        int level = height(root) - 1;
        for (int i = 1; i <= level; i++) {
            if (i % 2 != 0)
                nthLevel(root, i);
            else
                zigzagLevel(root, i);
            System.out.println();
        }

        List<Integer> arr = new ArrayList<>();

    }
}
