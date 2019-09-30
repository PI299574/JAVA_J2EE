package LearnBayTree;

import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTree {

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
  
  BinarySearchTreeInsert tree1 = new BinarySearchTreeInsert();

	/*
  50
/     \
30      70
/  \    /  \
20   40  60   80 */
tree1.insertRecursive(50);
tree1.insertRecursive(30);
tree1.insertRecursive(20);
tree1.insertRecursive(40);
tree1.insertRecursive(70);
tree1.insertRecursive(60);
tree1.insertRecursive(80);
	

boolean identical=IsIdentical(tree.root,tree1.root);
System.out.println("Is identical "+identical);

boolean identical1=IsIdenticalIterative(tree.root,tree1.root);
System.out.println("Is identical "+identical1);
	}

	private static boolean IsIdenticalIterative(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		
		Queue<TreeNode> queue1=new LinkedList<>();
		Queue<TreeNode> queue2=new LinkedList<>();
		TreeNode current1=root1;
		TreeNode current2=root2;
		boolean flag=false;
		if(null == current1 && null==current2){
			return true;
		}
		if(null == current1 || null==current2){
			return false;
		}
		else{
			queue1.offer(current1);
			queue2.offer(current2);
			while(!queue1.isEmpty() && !queue2.isEmpty()){
				current1=queue1.poll();
				current2=queue2.poll();
				if(current1.data==current2.data){
					if(null!=current1.leftChild){
						queue1.offer(current1.leftChild);
					}
				if(null!=current2.leftChild){
					queue2.offer(current2.leftChild);
				}
			
				if(null!=current1.rightChild){
					queue1.offer(current1.rightChild);
				}
			if(null!=current2.rightChild){
				queue2.offer(current2.rightChild);
			}
			
			}
				else{
					return false;
				}
		}
			
		}
		if(queue1.isEmpty() && !queue2.isEmpty())
		{
			return false;
		}
		else if(queue2.isEmpty() && !queue1.isEmpty())
		{
			return false;
		}
		return true;
	}

	private static boolean IsIdentical(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		
			if(null==root1 && null==root2){
				return true;
			}
			 if(root1==null || root2==null){
				return false;
			}
		
			else{
				if(root1.data==root2.data){
					return IsIdentical(root1.leftChild,root2.leftChild) && IsIdentical(root1.rightChild, root2.rightChild);
				
				}else{
					return false;
				}
					
				
			}
	}

}
