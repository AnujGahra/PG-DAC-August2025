/**
 * 
 */
package tree;
import java.util.*;
/**
 * 
 */
public class BinaryTree {
	private BTNode root;

	public BinaryTree() {
		root = null;
	}

	private void preOrder(BTNode root) {
		if (root == null) {
			return;
		}

		System.out.println(root.data);

		if (root.lChild != null) {
			preOrder(root.lChild);
		}

		if (root.rChild != null) {
			preOrder(root.rChild);
		}
	}
	public void preOrder() {
		preOrder(root);
	}

	private void postOrder(BTNode root) {
		if (root == null) {
			return;
		}

		if (root.lChild != null) {
			postOrder(root.lChild);
		}

		if (root.rChild != null) {
			postOrder(root.rChild);
		}

		System.out.println(root.data);
	}
	public void postOrder() {
		postOrder(root);
	}

	private void inOrder(BTNode root) {
		if (root == null) {
			return;
		}

		if (root.lChild != null) {
			inOrder(root.lChild);
		}

		System.out.println(root.data);

		if (root.rChild != null) {
			inOrder(root.rChild);
		}
	}
	public void inOrder() {
		inOrder(root);
	}
	public void levelOrder() {
		if (root == null) {
			return;
		}

		Queue<BTNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			BTNode current = q.remove();

			System.out.println(current.data);

			if (current.lChild != null) {
				q.add(current.lChild);
			}

			if (current.rChild != null) {
				q.add(current.rChild);
			}
			
		}
	}

	public void buildTree01() {
		BTNode n1 = new BTNode(5);
		BTNode n2 = new BTNode(10);
		BTNode n3 = new BTNode(4);
		BTNode n4 = new BTNode(3);

		n1.lChild = n2;
		n1.rChild = n3;

		n2.lChild = n4;

		root = n1;
	}
}
