package LearnBayTree;

 class BinarySearchTreeInsert {

	TreeNode root;

	public BinarySearchTreeInsert(){
		root=null;
	}
	
	public void insertRecursive(int data) {
		root = insertTreeNode(root, data);
		//System.out.println(root.data);
	}

	public TreeNode insertTreeNode(TreeNode root, int data) {
		// TODO Auto-generated method stub
       // System.out.println(root);
		if (null == root) {
			//System.out.println("iii");
			root = new TreeNode(data);
			return root;
		} 
			
		if (data <= root.data){
				root.leftChild = insertTreeNode(root.leftChild, data);
			}
		else{
				root.rightChild = insertTreeNode(root.rightChild, data);
			}
		
		return root;
	}

	public void insertData(int data) {
		TreeNode node = new TreeNode(data);
		if (null == root) {
			root = node;
		} else {
			TreeNode parent;
			TreeNode current = root;
			while (true) {
                    
				if (current.data > data) {
					parent = current;
					current = current.leftChild;
					if (null == current) {
						parent.leftChild = node;
						return;
					}
				} else {
					parent = current;
					current = current.rightChild;
					if (null == current) {
						parent.rightChild = node;
						return;
					}
				}
			}
		}
	}
}
 
 
class BinarySearchTreeInsertData{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();

		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
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
		System.out.println("left right Node "+tree.root.leftChild.leftChild.data);
		System.out.println("right Node " + tree.root.rightChild.data);
		System.out.println("right right Node "+tree.root.rightChild.rightChild.data);
		 System.out.println("right right Node "+tree.root.rightChild.leftChild.data);

	}

}
