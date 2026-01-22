public class BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert in BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search in BST
    public static boolean search(Node root, int key) {
        if (root == null) return false;

        if (key < root.data)
            return search(root.left, key);
        else if (key > root.data)
            return search(root.right, key);
        else
            return true;
    }

    // Delete in BST
    public static Node delete(Node root, int val) {
        if (root == null) return null;

        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {

            // Case 1: leaf node
            if (root.left == null && root.right == null)
                return null;

            // Case 2: one child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Case 3: two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // Inorder Successor
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        inorder(root);
        System.out.println();

        System.out.println(search(root, 5) ? "Found" : "Not Found");

        root = delete(root, 3);
        inorder(root);
    }
}
