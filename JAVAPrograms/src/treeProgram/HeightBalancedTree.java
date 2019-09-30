package treeProgram;
/*
Consider a height-balancing scheme where following conditions should be checked to determine if a binary tree is balanced.
An empty tree is height-balanced. A non-empty binary tree T is balanced if:
1) Left subtree of T is balanced
2) Right subtree of T is balanced
3) The difference between heights of left subtree and right subtree is not more than 1. */
public class HeightBalancedTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
BinarySearchTree tree=new BinarySearchTree();
		
		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
  tree.insert(50);
  tree.insert(30);
  tree.insert(20);
  tree.insert(40);
  tree.insert(70);
  tree.insert(60);
  tree.insert(80);
  boolean isbalanced=IsheightBalancedTree(tree.root);
  System.out.println("IsBalance "+isbalanced);
	}

	private static boolean IsheightBalancedTree(TreeNode root) {
		// TODO Auto-generated method stub
		int lh=0;
		int rh=0;
		if(null==root){
			return true; //Imp
		}
		lh=height(root.leftChild);
		rh=height(root.rightChild);
		if(Math.abs(lh-rh) <= 1
				&& IsheightBalancedTree(root.leftChild)
				&& IsheightBalancedTree(root.rightChild)){
			
			return true;
		}else{
		return false;
	}
	}

	private static int height(TreeNode root) {
		// TODO Auto-generated method stub
		if(null==root){
			return 0;}
		else{
		return 1+ Math.max(height(root.leftChild) ,height(root.rightChild));	
		}
	}
}
