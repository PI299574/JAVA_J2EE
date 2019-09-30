package LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountallNode {

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
  
  	int totalNode=countAllNodes(tree.root);
    System.out.println("Total node is "+totalNode);
    int totalNode1=countAllNodeIterative(tree.root);
    System.out.println("total node iterative "+totalNode1);
	}

	private static int countAllNodeIterative(TreeNode root) {
		// TODO Auto-generated method stub
		
		TreeNode current=root;
		Queue<TreeNode> queue =new LinkedList<>();
		int count=0;
		if(null==current){
			return 0;
		}
		else{
			queue.offer(current);
			while(!queue.isEmpty()){
				current=queue.poll();
				if(current!=null){
					count++;
				}
				if(null!=current.leftChild){
					queue.offer(current.leftChild);
				}
				if(null!=current.rightChild){
					queue.offer(current.rightChild);
				}
			}
		}
		
		return count;
	}

	private static int countAllNodes(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(null==root){
			return 0;
			
		}
		else{
		return 1+countAllNodes(root.leftChild)+countAllNodes(root.rightChild);	
		}
		
	}

}
