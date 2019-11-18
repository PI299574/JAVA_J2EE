package treeProgram;


/*
 * Assuming that both n1 .n2 is present in the tree
 *  and from the node n such that n1<n<n2 occur then that n will be common anchester

 */
public class LowestCommonAnchester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		BinarySearchTree tree=new BinarySearchTree();

		/* Let us create following BST
		        50
		     /     \
		    30      70
		   /  \    /  \
		 20   40  60   80 */

		/*
		 LCA of two node 20, 40 is 30
		 LCA of two node 30,40 is 30
		 LCA of two node 40,60 is 50
		 LCA of two node 80,70 is 70

		 Sol1:
		 20<30<40 that is n1,node<ne then node is common achester
		 We can recursively traverse the BST from root. The main idea of the solution is, while traversing from top to bottom,
		 the first node n we encounter with value between n1 and n2, i.e., n1 < n < n2 or same as one of the n1 or n2, is LCA
		 of n1 and n2 (assuming that n1 < n2). So just recursively traverse the BST in, if node’s value is greater than both n1
		 and n2 then our LCA lies in left side of the node,
		 if it’s is smaller than both n1 and n2, then LCA lies on right side. Otherwise root is LCA
		 (assuming that both n1 and n2 are present in BST)
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		TreeNode node=LCARecursive(tree.root,80,70);
		System.out.println(node.data);
		TreeNode node1=LCAIterative(tree.root,40,60);
		System.out.println(node1.data);
	}

	private static TreeNode LCAIterative(TreeNode root, int n1, int n2) {
		// TODO Auto-generated method stub
		if(null==root){
			return null;
		}
		while(root!=null){
			if(root.data>n1 && root.data>n2){
				root=root.leftChild;
			}
			else if(root.data<n1 && root.data<n2){
				root=root.rightChild;
			}else{
				break;
			}

		}
		return root;
	}

	private static TreeNode LCARecursive(TreeNode root, int n1, int n2) {
		// TODO Auto-generated method stub
		if(null==root){
			return null;
		}

		if(root.data>n1 && root.data>n2){
			root=LCARecursive(root.leftChild,n1,n2);
		}
		if(root.data<n1 && root.data<n2){
			root=LCARecursive(root.rightChild,n1,n2);
		}
		return root;
	}

}
