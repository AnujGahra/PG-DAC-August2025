package tree;

public class Treeapp {
	

		public static void main(String[] args) {
			BinaryTree tree01 = new BinaryTree();

			tree01.buildTree01();

			System.out.println("Pre order traversal of tree ...");
			tree01.preOrder();

			System.out.println("Post order traversal of tree ...");
			tree01.postOrder();

			System.out.println("In order traversal of tree ...");
			tree01.inOrder();
			System.out.println("In level-order traversal of tree ...");
			tree01.levelOrder();

			
		}

	}

