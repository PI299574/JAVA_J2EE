package treeProgram;

public class MiniumDepthOfBinaryTree {

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
  int depth = minimumDepth(tree.root);
  System.out.println("depth is **********"+depth);
}

	private static int minimumDepth(TreeNode root) {
		// TODO Auto-generated method stub
		if(null ==root){
			return 0;
		}
		if(root.leftChild==null && root.rightChild==null){
			return 1;
		}
		if(root.leftChild==null){
			return 1+minimumDepth(root.rightChild);
		}
		if(root.rightChild==null){
			return 1+minimumDepth(root.leftChild);
		}
		return 1+Math.min(minimumDepth(root.leftChild), minimumDepth(root.rightChild));
		
	}

}
