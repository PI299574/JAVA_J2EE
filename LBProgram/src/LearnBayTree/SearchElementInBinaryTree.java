package LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchElementInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();
		tree.root = new TreeNode(10);
		tree.root.leftChild = new TreeNode(20);
		tree.root.rightChild = new TreeNode(30);
		Integer element = 20;
		boolean found = searchElement(tree.root, element);
		System.out.println("Is element present " + found);
		
		boolean found1 = searchElementIterative(tree.root, element);
		System.out.println("Is element present " + found1);
	}

	private static boolean searchElementIterative(TreeNode root, Integer element) {
		// TODO Auto-generated method stub
	     Queue<TreeNode> queue=new LinkedList<>();
	     boolean flag=false;
	     TreeNode current=root;
	     
	     if(null==root){
	    	 return false;
	     }
	     else{
	    	 queue.offer(current);
	    	 while(!queue.isEmpty()){
	    		 current=queue.poll();
	    		 if(current.data!=element){
	    			 if(null!=current.leftChild){
	    				 queue.offer(current.leftChild);
	    			 }
	    			 if(null!=current.rightChild){
	    				 queue.offer(current.rightChild);
	    			 }
	    		 }
	    		 else{
	    			 flag= true;
	    		 }
	    		 
	    		 
	    	 }
	     }
	     return flag;
	}

	private static boolean searchElement(TreeNode root, Integer element) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (null == root) {
			return false;
		} else {

			if (root.data == element) {
				return true;
			} else {

				flag = searchElement(root.leftChild, element);
				if (flag == true) {
					return true;
				} else {
					flag = searchElement(root.rightChild, element);
				}
				if (flag == true) {
					return true;
				}

			}

		}
		return false;

	}

}
