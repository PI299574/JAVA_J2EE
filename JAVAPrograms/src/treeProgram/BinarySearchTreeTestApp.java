package treeProgram;


public class BinarySearchTreeTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BinarySearchTree tree=new BinarySearchTree();
		
		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
/*  tree.insert(50);
  tree.insert(30);
  tree.insert(20);
  tree.insert(40);
  tree.insert(70);
  tree.insert(60);
  tree.insert(80);*/
  
  tree.insertRecursive(50);
  tree.insertRecursive(30);
  tree.insertRecursive(20);
  tree.insertRecursive(40);
  tree.insertRecursive(70);
  tree.insertRecursive(60);
  tree.insertRecursive(80);

		System.out.println("Root Node " + tree.root.data);
		System.out.println("left Node " + tree.root.leftChild.data);
		System.out.println("left Node "+tree.root.leftChild.leftChild.data);
		System.out.println("left right Node "+tree.root.leftChild.rightChild.data);
		System.out.println("right Node " + tree.root.rightChild.data);
		System.out.println("right left Node "+tree.root.rightChild.leftChild.data);
		 System.out.println("right right Node "+tree.root.rightChild.rightChild.data);
		 
		 
		 
		 
		 
	}

}
