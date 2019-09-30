package LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxSumAtEachLevel {

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
  
   //int sum = maxsum(tree.root);
   
   int sum1 = maxsum1(tree.root);

   //System.out.println(sum);
   
	}

	private static int maxsum1(TreeNode root) {
		// TODO Auto-generated method stub
		Stack<TreeNode> stack1=new Stack<>();
		Stack<TreeNode> stack2=new Stack<>();
		int sum1=0,sum2=0,maxsum=0;
		int i=0;
		TreeNode current=root;
		if(null==current){
			return 0;
		}
		else{
			stack1.push(current);
			while(!stack1.isEmpty() || !stack2.isEmpty()){
				while(!stack1.isEmpty()){
					current=stack1.pop();
					sum1=sum1+current.data;
					
		//			System.out.println(current.data);
					if(null!=current.rightChild){
						stack2.push(current.rightChild);
					}
					if(null!=current.leftChild){
						stack2.push(current.leftChild);
					}
					
				}
				System.out.println("sum at level  "+i +" is "+sum1);
				i++;
				sum1=0;
				while(!stack2.isEmpty()){
					current=stack2.pop();
					sum2=sum2+current.data;
					
					//System.out.println(current.data);
					if(null!=current.leftChild){
						stack1.push(current.leftChild);
					}
					if(null!=current.rightChild){
						stack1.push(current.rightChild);
					}
					
				}
				
				System.out.println("sum at level  "+i +" is "+sum2);
				i++;				
				sum2=0;
			
			}
		}
		//System.out.println("ppp "+maxsum);
		return 0;
	}

	private static int maxsum(TreeNode root) {
		// TODO Auto-generated method stub
		
		TreeNode current=root;
		Queue<TreeNode> queue=new LinkedList<>();
		int sum=0;
		if(null==current){
			return 0;
		}else{
			queue.add(current);
			
			while(!queue.isEmpty()){
				current=queue.remove();
				if(null!=current.leftChild){
					queue.add(current.leftChild);
				}
				if(null!=root.rightChild){
					queue.add(current.rightChild);
				}
			}
		}
		return 0;
	}

}
