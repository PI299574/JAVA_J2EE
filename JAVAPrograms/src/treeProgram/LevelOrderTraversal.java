package treeProgram;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		levelOrderTraversal(tree.root);
	}

	private static void levelOrderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		TreeNode current = null;
		while (!queue.isEmpty()) {
			current = queue.poll();
			System.out.print(current.data + " ");
			if (null != current.leftChild) {
				queue.add(current.leftChild);
			}
			if (null != current.rightChild) {
				queue.add(current.rightChild);
			}
		}

	}

}
