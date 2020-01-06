package treeProgram;
/*
 To check whether a binary tree is a full binary tree we need to test the following cases:-


1) If a binary tree node is NULL then it is a full binary tree.
2) If a binary tree node does have empty left and right sub-trees, then it is a full binary tree by definition.
3) If a binary tree node has left and right sub-trees, then it is a part of a full binary tree by definition. 
In this case recursively check if the left and right sub-trees are also binary trees themselves.
4) In all other combinations of right and left sub-trees, the binary tree is not a full binary tree.
 */
public class fullBinaryTreeCheck {

	public static void main(String[] args) {
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
  //tree.insert(40);
  tree.insert(70);
  boolean flag = IsFullBinaryTree(tree.root);
  System.out.println("Binary Tree is **********"+flag);
	}

	private static boolean IsFullBinaryTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(null==root){
			return true;
		}
		if(root.leftChild==null && root.rightChild == null){
			return true;
		}
		if(root.leftChild!=null && root.rightChild!=null){
			return IsFullBinaryTree(root.leftChild) && IsFullBinaryTree(root.rightChild);
		}
		return false;
	}

}

