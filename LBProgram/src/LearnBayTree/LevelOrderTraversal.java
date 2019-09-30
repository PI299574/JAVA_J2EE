package src.LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();

		/*
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 
 
 output will be 50 30 70 20 40 60 80
 */
  tree.insertRecursive(50);
  tree.insertRecursive(30);
  tree.insertRecursive(20);
  tree.insertRecursive(40);
  tree.insertRecursive(70);
  tree.insertRecursive(60);
  tree.insertRecursive(80);
  
  
  levelOrdertraversal(tree.root);
	}

	private static void levelOrdertraversal(TreeNode root) {
		// TODO Auto-generated method stub
		
		Queue<TreeNode> queue=new LinkedList<>();
		
		queue.add(root);
		TreeNode current=null;
		while(!queue.isEmpty()){
			current=queue.poll();
			System.out.println(current.data);
			if(null!=current.leftChild){
				queue.add(current.leftChild);
			}
			if(null!=current.rightChild){
				queue.add(current.rightChild);
			}
			
		}
	}

}
