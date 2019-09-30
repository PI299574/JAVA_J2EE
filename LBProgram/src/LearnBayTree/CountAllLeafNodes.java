package LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;


public class CountAllLeafNodes {

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
  int leafNode=countLeafNode(tree.root);
  System.out.println("No of Leaf node "+leafNode);
  
  int leafNode1=countLeafNodeIterative(tree.root);
  System.out.println("No of Leaf node iterative "+leafNode1);
  
	}

	private static int countLeafNodeIterative(TreeNode root) {
		// TODO Auto-generated method stub
		
		TreeNode current=root;
		int count=0;
		Queue<TreeNode> queue=new LinkedList<>();
		if(null==current){
			return 0;
		}else{
			queue.offer(current);
			while(!queue.isEmpty()){
				current=queue.poll();
				if(current.leftChild==null && current.rightChild==null){
					count++;
				}
				if(current.leftChild!=null){
					queue.offer(current.leftChild);
				}
				if(current.rightChild!=null){
					queue.offer(current.rightChild);
				}
			}
		}
		return count;
	}

	private static int countLeafNode(TreeNode root) {
		// TODO Auto-generated method stub
		TreeNode current=root;
		if(null==current){
			return 0;
		}
		else if(current.leftChild==null && current.rightChild==null){
			return 1;
		}
		else{
			return countLeafNode(current.leftChild)+countLeafNode(current.rightChild);
		}
			
			
		
	}

}
