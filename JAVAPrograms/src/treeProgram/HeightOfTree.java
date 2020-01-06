package treeProgram;


public class HeightOfTree {

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
  //tree.insert(100);
  int height=Height(tree.root);
  System.out.println("Height is "+height);
  
	}

	private static int Height(TreeNode root) {
		// TODO Auto-generated method stub
            int height=0;
		if(null==root){
			return 0;
		}else{
		int leftHeight=1+Height(root.leftChild);
		int rightHeight=1+Height(root.rightChild);
		height=Math.max(leftHeight, rightHeight);
		
		}
		return height;
	}

}
