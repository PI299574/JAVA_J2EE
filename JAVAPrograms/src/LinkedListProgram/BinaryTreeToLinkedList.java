package LinkedListProgram;

import java.util.Stack;

import treeProgram.BinarySearchTree;
import treeProgram.TreeNode;

public class BinaryTreeToLinkedList {

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
		
		convertIntoLinkedList(tree.root);

	}

	private static void convertIntoLinkedList(TreeNode root) {
		// TODO Auto-generated method stub
		if(null == root){
			return ;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode current = stack.pop();
			System.out.print(current.data+ "***");
			if((null!=current.leftChild)){
				stack.push(current.leftChild);
			}
			if(null!=current.rightChild){
				stack.push(current.rightChild);
			}
		
			if(!stack.isEmpty()){
				System.out.println(stack.peek().data+"&&&&");
				current.rightChild=stack.peek();
			}
			current.leftChild=null;
		}
		
	}

}
