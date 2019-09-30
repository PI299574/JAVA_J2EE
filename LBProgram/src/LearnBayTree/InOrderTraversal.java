package LearnBayTree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {

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
	System.out.println("Recursive InOrder ");	
  InOrder(tree.root);
  System.out.println(" ");
  System.out.println("InOrder traversal");
 InOrderTraversalwithoutRecursion(tree.root);
	}

	

	private static void InOrderTraversalwithoutRecursion(TreeNode root) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		boolean done=false;
		
			
			TreeNode current=root;
			while(!done){
				if(null!=current){
				stack.push(current);
				current=current.leftChild;
				}
				
				else{
					if(stack.isEmpty()){
						done =true;
					}
					else{
					current=stack.pop();
					System.out.print(current.data+" ");
					current=current.rightChild;
					}
				}
			}
		}
			
	
	



	private static void InOrder(TreeNode root) {
		// TODO Auto-generated method stub
		if(null!=root){
			InOrder(root.leftChild);
			System.out.print(root.data+" ");
			InOrder(root.rightChild);
		}
		
	}

}
