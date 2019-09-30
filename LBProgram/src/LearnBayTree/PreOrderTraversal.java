package LearnBayTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PreOrderTraversal {

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
  
  ArrayList<Integer> list=preOrderwithoutRecursion(tree.root);
  
  Iterator<Integer> it=list.iterator();
     while(it.hasNext()){
	  System.out.print(it.next()+ " ");
  	}
  	System.out.println(" ");
  	preOrder(tree.root);
	}
 
	private static void preOrder(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(null!=root){
			System.out.print(root.data+ " ");
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}
	}

	private static ArrayList<Integer> preOrderwithoutRecursion(TreeNode root) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		if(null==root){
			return null;
		}else{
			stack.push(root);
			while(!stack.isEmpty()){
				TreeNode node=stack.pop();
				list.add(node.data);
				//System.out.println(node.data);
				if(null!=node.rightChild){
					stack.push(node.rightChild);
				}
				if(null!=node.leftChild){
					stack.push(node.leftChild);
				}
			}
		}
		
		
		return list;
		
		
		
	}

}
