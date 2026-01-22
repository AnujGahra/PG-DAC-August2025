/**
 * 
 */
package tree;

/**
 * 
 */
public class BTNode {
	int data;
	BTNode lChild;
	BTNode rChild;

	public BTNode() {
		data = 0;
		lChild = null;
		rChild = null;
	}

	public BTNode(int element) {
		data = element;
		lChild = null;
		rChild = null;
	}
}