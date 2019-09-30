package treeProgram;




public class MirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    BinarySearchTree tree = new BinarySearchTree();
		tree.root=new TreeNode(10);
		tree.root.leftChild=new TreeNode(20);
		tree.root.rightChild=new TreeNode(30);
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.root=new TreeNode(10);
		tree1.root.leftChild=new TreeNode(30);
		tree1.root.rightChild=new TreeNode(20);
		boolean mirror=isMirrorTree(tree.root,tree1.root);
		System.out.println("mirror "+mirror);
	} 

	private static boolean isMirrorTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(null==root1 && null==root2){
			return true;
		}
		if(null==root1 || null==root2){
			return false;
		}
		if(root1.data==root2.data){
			return isMirrorTree(root1.leftChild,root2.rightChild) && isMirrorTree(root1.rightChild,root2.leftChild);
		}else{
			return false;
		}
	}

	

}
