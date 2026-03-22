public class SearchInBST {

    // Node class
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    // Search function
    public static Node search(Node root, int val) {
        if (root == null)
            return null;

        if (root.val == val)
            return root;

        if (val < root.val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    // Insert into BST
    public static Node insertIntoBST(Node root, int val) {

        if (root == null)
            return new Node(val);
        if (root.val > val) {
            if (root.left == null)
                root.left = new Node(val);
            else
                insertIntoBST(root.left, val);
        } else {
            if (root.right == null)
                root.right = new Node(val);
            else
                insertIntoBST(root.left, val);
        }

        return root;
    }

    public static void main(String[] args) {

        // Creating BST manually
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        int key = 7;

        Node result = search(root, key);

        if (result != null) {
            System.out.println("Value found: " + result.val);
        } else {
            System.out.println("Value not found");
        }
    }
}