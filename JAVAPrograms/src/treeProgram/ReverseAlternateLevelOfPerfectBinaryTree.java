package treeProgram;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseAlternateLevelOfPerfectBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinarySearchTree tree=new BinarySearchTree();
		
		/* Let us create following BT
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 
 
 *
 *
 *o/p: 
/* following BT
        50
     /     \
    70      30
   /  \    /  \
 20   40  60   80 */
 
TreeNode root = new TreeNode('a');  
root.leftChild = new TreeNode('b');  
root.rightChild = new TreeNode('c');  
root.leftChild.leftChild = new TreeNode('d');  
root.leftChild.rightChild = new TreeNode('e');  
root.rightChild.leftChild = new TreeNode('f');  
root.rightChild.rightChild = new TreeNode('g');  
root.leftChild.leftChild.leftChild = new TreeNode('h');  
root.leftChild.leftChild.rightChild = new TreeNode('i');  
root.leftChild.rightChild.leftChild = new TreeNode('j');  
root.leftChild.rightChild.rightChild = new TreeNode('k');  
root.rightChild.leftChild.leftChild = new TreeNode('l');  
root.rightChild.leftChild.rightChild = new TreeNode('m');  
root.rightChild.rightChild.leftChild = new TreeNode('n');  
root.rightChild.rightChild.rightChild = new TreeNode('o');  

	printInLevelOrderTraversal(root);
	if(root!=null){
	alternateLevel(root.leftChild,root.rightChild,0);
	}
	System.out.println("after reversing******");
	printInLevelOrderTraversal(root);
System.out.println("Another *********");
	tree.insert(50);
 	tree.insert(30);
 	tree.insert(20);
 	tree.insert(40);
 	tree.insert(70);
 	tree.insert(60);
 	tree.insert(80);
 	printInLevelOrderTraversal(tree.root);
 	if(tree.root!=null){
 	alternateLevel(tree.root.leftChild,tree.root.rightChild,0);
 	System.out.println("after reversing******");
 	printInLevelOrderTraversal(tree.root);
	}
	}


	private static void alternateLevel(TreeNode root1, TreeNode root2, int level) {
		// TODO Auto-generated method stub
		
		if(root1==null || root2==null){
			return;
		}
		if(level%2==0){
			int temp=root1.data;
			root1.data=root2.data;
			root2.data=temp;
		}
		alternateLevel(root1.leftChild,root2.rightChild,level+1);
		alternateLevel(root1.rightChild,root2.leftChild,level+1);
	}

	private static void printInLevelOrderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
	if(null==root){
		return;
	}else{
		Queue<TreeNode> queue=new LinkedList<>(); 
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode current=queue.remove();
			System.out.print(current.data+" ");
			if(current.leftChild!=null){
				queue.add(current.leftChild);
			}
			if(current.rightChild!=null){
				queue.add(current.rightChild);
			}
		}
	}
	}
}
