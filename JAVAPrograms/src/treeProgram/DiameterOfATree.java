package treeProgram;
/*
 
    Find the height of left subtree.
    Find the height of right subtree.
    Find the left diameter.
    Find the right diameter.
    Return the Maximum(Diameter of left subtree, Diameter of right subtree, Longest path between two nodes which passes through the root.)

Time Complexity: Since when calculating the diameter, every iteration for every node, is calculating height of 
tree separately in which we iterate the tree from top to bottom and when we calculate diameter recursively so its O(N2)
 */
public class DiameterOfATree {

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
  int diameter=diameterOfTree(tree.root);
  System.out.println("diameter "+diameter);
}

	private static int diameterOfTree(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root==null){
			return 0;
		}
		else{
		int lHeight=height(root.leftChild);
		int rHeight=height(root.rightChild);
		
		int lDiameter=diameterOfTree(root.leftChild);
		int rDiameter=diameterOfTree(root.rightChild);
		
		return Math.max(Math.max(lDiameter, rDiameter), (lHeight+rHeight+1));
		}
		
	}

	private static int height(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root==null){
			return 0;
		}
		else{
		return 1+Math.max(height(root.leftChild), height(root.rightChild));
		}
	}

}
