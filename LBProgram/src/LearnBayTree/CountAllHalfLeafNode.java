package LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountAllHalfLeafNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();

		/*
		 * 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insertRecursive(50);
		tree.insertRecursive(30);
		tree.insertRecursive(20);
		tree.insertRecursive(40);
		tree.insertRecursive(70);
		tree.insertRecursive(60);
		// tree.insertRecursive(80);

		int halfleafNode = halfLeafNode(tree.root);
		System.out.println("all half leaf node " + halfleafNode);
		int halfleafNode1 = halfLeafNodeIterative(tree.root);
		System.out.println("all half leaf node " + halfleafNode1);
	}

	private static int halfLeafNodeIterative(TreeNode root) {
		// TODO Auto-generated method stub
		
		Queue<TreeNode> queue=new LinkedList<>();
		int count=0;
		TreeNode current=root;
		if(null==root){
			return 0;
		}
		else{
			queue.offer(current);
			while(!queue.isEmpty()){
				current=queue.poll();
				if((current.leftChild!=null && current.rightChild==null) ||
					current.leftChild==null && current.rightChild!=null	){
					count++;
				}
				if(null!=current.leftChild){
					queue.offer(current.leftChild);
				}
				if(current.rightChild!=null){
					queue.offer(current.rightChild);
				}
			}
		}
		return count;
	}

	private static int halfLeafNode(TreeNode root) {
		// TODO Auto-generated method stub

		TreeNode current = root;
		if (null == current) {
			return 0;
		} else if ((current.leftChild == null && current.rightChild != null)
				|| current.leftChild != null && current.rightChild == null) {
			return 1;
		} else {
			return halfLeafNode(current.leftChild) + halfLeafNode(current.rightChild);
		}

	}
}