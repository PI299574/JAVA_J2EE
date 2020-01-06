package treeProgram;

public class SubtreeOfTree {

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
 	tree.insert(40);
 	tree.insert(70);
 	tree.insert(60);
 	tree.insert(80);
 	
 	BinarySearchTree tree1=new BinarySearchTree();
 	tree1.insert(70);
 	tree1.insert(80);
 	tree1.insert(60);  //change it to 50 for another test
 	boolean flag = IsSubtree(tree.root,tree1.root);
 	System.out.println("Is SubTree******"+flag);
	}

	private static boolean IsSubtree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		
		if(root1==null){
			return false;
		}
		if(root2==null){
			return true;
		}
		if(IsIdentical(root1,root2)){
			return true;
		}
		return IsIdentical(root1.leftChild, root2) || IsIdentical(root1.rightChild, root2);
	}

	private static boolean IsIdentical(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
	
		if(root1==null && root2==null){
			return true;
		}
		if(root1==null || root2==null){
			return false;
		}
		if(root1.data==root2.data){
			return IsIdentical(root1.leftChild, root2.leftChild) && IsIdentical(root1.rightChild, root2.rightChild);
		}
		return false;
	}

}
