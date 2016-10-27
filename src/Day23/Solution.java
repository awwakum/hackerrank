package Day23;

import java.util.PriorityQueue;
import java.util.Queue;

/* https://www.hackerrank.com/challenges/30-binary-trees */
public class Solution {

	static void levelOrder(Node root) {

        Queue queue = new PriorityQueue();


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
	}
}
