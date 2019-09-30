package LearnBayTree;

import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();

		/*
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
  System.out.println("post order recursive ");
  postOrder(tree.root);
  System.out.println("post Order Iterative ");
  postOrderIterative(tree.root);
	}

	private static void postOrderIterative(TreeNode root) {
		// TODO Auto-generated method stub
		
		TreeNode current=root;
		Stack<TreeNode> stack=new Stack<>();
		boolean flag=false;
		while(!flag){
			
				if(null!=current){
				stack.push(current);
				current=current.rightChild;
				}
				else{
					if(stack.isEmpty()){
						flag=true;
					}
					else{
						current=stack.pop();
						System.out.print(current.data+" ");
						current=current.leftChild;
					}
				
			}
		}
	}

	private static void postOrder(TreeNode root) {
		// TODO Auto-generated method stub
	
		if(root!=null){
			postOrder(root.rightChild);
			postOrder(root.leftChild);
			System.out.print(root.data +" ");
			
		}
	}

}
