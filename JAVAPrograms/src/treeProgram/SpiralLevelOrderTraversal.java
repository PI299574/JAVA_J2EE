package treeProgram;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class SpiralLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
BinarySearchTree tree=new BinarySearchTree();
		
		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
 tree.insert(50);
  tree.insert(30);
  tree.insert(20);
  tree.insert(40);
  tree.insert(70);
  tree.insert(60);
  tree.insert(80);
  spiralOderTraversal(tree.root);
	}

	private static void spiralOderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
	Stack<TreeNode> stack1=new Stack<>();
	Stack<TreeNode> stack2=new Stack<>();
	TreeNode current=root;
	stack1.push(current);
	while(!stack1.isEmpty() || !stack2.isEmpty()){
		while(!stack1.isEmpty()){
			current=stack1.pop();
			System.out.print(current.data+ " " );
			if(null!=current.leftChild){
				stack2.push(current.leftChild);
			}
			if(null!=current.rightChild){
				stack2.push(current.rightChild);
			}
		}
		while(!stack2.isEmpty()){
			current=stack2.pop();
			System.out.print(current.data+ " " );
			if(null!=current.rightChild){
				stack1.push(current.rightChild);
			}
			if(null!=current.leftChild){
				stack1.push(current.leftChild);
			}
		}
	}
		
	}

}
