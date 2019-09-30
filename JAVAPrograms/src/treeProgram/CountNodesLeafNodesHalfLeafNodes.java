package treeProgram;




public class CountNodesLeafNodesHalfLeafNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(100);
		int nodeCount=CountNodes(tree.root);
		System.out.println("nodeCount is "+nodeCount);

		//int nodeHalfLeafCount=CountHalfLeafNodes(tree.root);
		//System.out.println("nodeHalfLeafCount is "+nodeHalfLeafCount);

		//int nodeLeafCount=CountLeafNodes(tree.root);
		//System.out.println("nodeLeafCount is "+nodeLeafCount);

	}

	private static int CountLeafNodes(TreeNode root) {
		// TODO Auto-generated method stub
		if(null==root){
			return 0;
		}
		if(null==root.leftChild && null==root.rightChild){
			return 1;
		}
		return CountLeafNodes(root.leftChild) + CountLeafNodes(root.rightChild);
	}

	private static int CountHalfLeafNodes(TreeNode root) {
		// TODO Auto-generated method stub
		if(null==root){
			return 0;
		}
		if((null == root.leftChild && null != root.rightChild) || (null != root.leftChild && null == root.rightChild) ){
			return 1;
		}
		return CountHalfLeafNodes(root.leftChild) + CountHalfLeafNodes(root.rightChild);
	}

	private static int CountNodes(TreeNode root) {
		// TODO Auto-generated method stub
		if(null==root){
			return 0;
		}
		return 1 + CountNodes(root.leftChild)+CountNodes(root.rightChild);
	}

}
