package LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;

public class maxElementInTree {

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
  
    int max=maxElementRecursive(tree.root);
  System.out.println("max element is "+max);
  
  int max1=maxElementIterative(tree.root);
  System.out.println("max Element is iterative "+max);
	}

	private static int maxElementIterative(TreeNode root) {
		// TODO Auto-generated method stub
		TreeNode current=root;
		Queue<TreeNode> queue=new LinkedList<>();
		int max=0;
		if(null!=current){
			queue.offer(current);
			while(!queue.isEmpty()){
				current=queue.poll();
				//System.out.println(current.data);
				if(max<current.data){
					max=current.data;
				}
				if(null!=current.leftChild){
					queue.offer(current.leftChild);
				}
				if(null!=current.rightChild){
					queue.offer(current.rightChild);
				}
			}
		}
		
		
		return max;
	}

	private static int maxElementRecursive(TreeNode root) {
		// TODO Auto-generated method stub
      TreeNode current=root;
      int max=0;
      if(null!=current){
      if(current.data>max){
    	  max=current.data;
      }
      
      int leftmax=maxElementRecursive(current.leftChild);
      int rightmax=maxElementRecursive(current.rightChild);
      
      if(max<leftmax){
    	  max=leftmax;
      }
      if(max<rightmax){
    	  max=rightmax;
      }      
      }
		return max;
	}

}
