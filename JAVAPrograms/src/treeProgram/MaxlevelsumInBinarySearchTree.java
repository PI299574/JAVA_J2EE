package treeProgram;

import java.util.LinkedList;
import java.util.Queue;

public class MaxlevelsumInBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50); // insert method() present in BinarySearchTree program
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		int sum = maxlevelsum(tree.root);
		System.out.println("Sum is " + sum);
	}

	private static int maxlevelsum(TreeNode root) {
		// TODO Auto-generated method stu
		int maxSum = 0;
		if (null == root) {
			return 0;
		} else {
			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);
			TreeNode current = null;
			while (!queue.isEmpty()) {
				int sum = 0;
				int size = queue.size();
				while (size > 0) {
					current = queue.poll();
					sum = sum + current.data;
					if (null != current.leftChild) {
						queue.add(current.leftChild);
					}
					if (null != current.rightChild) {
						queue.add(current.rightChild);
					}
					size--;
				}
				maxSum = Math.max(maxSum, sum);
			}
			return maxSum;
		}

	}
}
