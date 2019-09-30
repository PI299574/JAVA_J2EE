package treeProgram;


public class CheckBST {

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
  boolean b=ISBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
  if(b==true) System.out.println("Binasry search tree");
  else System.out.println("Not a Binary Search Tree");
}

	private static boolean ISBST(TreeNode root, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if(null==root){
			return true;
		}
		if(root.data < minValue || root.data >maxValue){
			return false;
		}
		return ISBST(root.leftChild, minValue,root.data-1) && ISBST(root.rightChild,root.data+1, maxValue);
	}
	

}
