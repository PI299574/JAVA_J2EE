package LearnBayTree;

import java.util.Stack;

public class ZigZagTraversalOrSpiraltraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();

		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
  tree.insertRecursive(50);
  tree.insertRecursive(30);
  tree.insertRecursive(20);
  tree.insertRecursive(40);
  tree.insertRecursive(70);
  tree.insertRecursive(60);
  tree.insertRecursive(80);
  
     zigzagTraversal(tree.root);
	}

	private static void zigzagTraversal(TreeNode root) {
		// TODO Auto-generated method stub
	Stack<TreeNode> stack1=new Stack<>();
	Stack<TreeNode> stack2=new Stack<>();
	TreeNode current=root;
	stack1.push(current);
	while(!stack1.isEmpty() || !stack2.isEmpty()){
		while(!stack1.isEmpty()){
		  current=stack1.pop();
		  System.out.print(current.data+ " ");
		  if(null!=current.leftChild){
			  stack2.push(current.leftChild);
		  }
		  if(null!=current.rightChild){
			  stack2.push(current.rightChild);
		  }
		  
	}
		
		while(!stack2.isEmpty()){
			current=stack2.pop();
			System.out.print(current.data+" " );
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
