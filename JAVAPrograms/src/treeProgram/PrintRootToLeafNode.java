package treeProgram;

public class PrintRootToLeafNode {

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
  printRootToLeaf(tree.root);
	}

	private static void printRootToLeaf(TreeNode root) {
		// TODO Auto-generated method stub
		int arr[]=new int[10000];
	printNodeinTree(root,0,arr);	
	}

	private static void printNodeinTree(TreeNode root, int len, int[] arr) {
		// TODO Auto-generated method stub
		if(null==root){
			return;
		}
		arr[len]=root.data;
		len++;
		if(null==root.leftChild && null==root.rightChild)
		{
			printArray(arr,len);
		}else{
			printNodeinTree(root.leftChild,len,arr);
			printNodeinTree(root.rightChild,len,arr);
		}
	}

	private static void printArray(int[] arr, int len) {
		// TODO Auto-generated method stub
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(""); 
	}

}
