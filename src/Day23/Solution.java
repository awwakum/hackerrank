package Day23;

import java.util.LinkedList;
import java.util.Queue;

/* https://www.hackerrank.com/challenges/30-binary-trees */
public class Solution {

	static void levelOrder(Node root) {

		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.printf("%d ", node.data);
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
		}

	}

	private static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Node root = null;
		int[] arr = { 3, 5, 4, 7, 2, 1 };
		for (int i : arr) {
			root = insert(root, i);
		}
		levelOrder(root);
		/* output -> 3 2 5 1 4 7 */
	}
}
