import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class sizeMaxSumHeight {

    // static int size = 0;

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Preorder traversal to display tree
    // public static void preOrderDisplay(Node root) {
    //     if(root == null) {
    //         return;
    //     }
    //     System.out.print(root.val + " ");
    //     size++;
    //     preOrderDisplay(root.left);
    //     preOrderDisplay(root.right);
    // }

    // InOrder traversal to display tree
    public static void inOrderDisplay(Node root) {
        if(root == null) return;
        inOrderDisplay(root.left);
        System.out.print(root.val + " ");
        inOrderDisplay(root.right);
    }

    // PostOrder traversal to display tree
    public static void PostOrderDisplay(Node root) {
        if (root == null) return ;
        PostOrderDisplay(root.left);
        PostOrderDisplay(root.right);
        System.out.print(root.val + " ");   
        
    }

    // for size of tree
    public static int size(Node root) {
        if(root == null) return 0;
        return size(root.left) + size(root.right) + 1;

    }

    // Sum of all nodes
    public static int sum(Node root) {
        if(root == null) return 0;
        return sum(root.left) + sum(root.right) + root.val;
    }

    // Find node with maximum value
    public static int maxValueNode(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxValueNode(root.left), maxValueNode(root.right)));
    }

    // Height of Binary Tree
    public static int height(Node root) {
        if(root == null) return -1; // height in terms of edges
        // if(root == null) return 0; // height in terms of nodes
        if(root.left == null && root.right == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }


    // minValue of Binary Tree
    public static int minValueNode(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minValueNode(root.left), minValueNode(root.right)));
    }

    // Product of all Nodes in Binary Tree
    public static int productBinaryTree(Node root) {
        if(root == null) return 1;
        return productBinaryTree(root.left) * productBinaryTree(root.right) * root.val;
    }

    // Print elements of nth level
    public static void nthLevel(Node root, int n) {
        if(root == null) return;
        if(n == 1) System.out.print(root.val + " ");
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }


    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size() > 0) {
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);

            System.out.print(temp.val + " ");
            q.remove();
        }
     }


    //  Binary Tree Paths
    // public void helper(TreeNode root, List<String> ans, String s) {
    //     if(root == null) return;
    //     if(root.left == null && root.right == null) {
    //         s += root.val;
    //         ans.add(s);
    //         return;
    //     }
        // helper(root.left, ans, s+=root.val+"->");
        // helper(root.right, ans, s+=root.val+"->");
    // }

    // Lowest Common Ancestor of a Binary Tree

//    class Solution {

//     public boolean contains(TreeNode root, TreeNode node) {
//         if (root == null) return false;
//         if (root == node) return true;
//         return contains(root.left, node) || contains(root.right, node);
//     }

//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if (root == null) return null;
//         if (root == p || root == q) return root;

//         boolean pInLeft = contains(root.left, p);
//         boolean qInLeft = contains(root.left, q);

//         // Nodes are on different sides → root is LCA
//         if (pInLeft != qInLeft) return root;

//         // Both on left
//         if (pInLeft)
//             return lowestCommonAncestor(root.left, p, q);
//         else
//             return lowestCommonAncestor(root.right, p, q);
//     }
// }


    
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
        Node f = new Node(9);
        b.left = f;
        b.right = e;


        // preOrderDisplay(root);

        // System.out.println("Size of the tree: " + size(root));

        // System.out.println("Sum of all nodes: " + sum(root));
        // System.out.println("Maximum value node: " + maxValueNode(root));

        // System.out.println("Height of the tree: " + height(root));

        // System.out.println("Minimum value node: " + minValueNode(root));

        // System.out.println("Product of all nodes in the tree: " + productBinaryTree(root));


        // inOrderDisplay(root); // calling for inorder display
        // System.out.println();
        // PostOrderDisplay(root); // calling for postorder display


        // nthLevel(root, 3);

        // int level = height(root);
        // for(int i = 1; i<=level; i++) {
        //     nthLevel(root, i);
        // }

        bfs(root);

    }
}
