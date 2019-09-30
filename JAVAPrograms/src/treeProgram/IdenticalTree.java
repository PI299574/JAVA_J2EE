package treeProgram;

public class IdenticalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new TreeNode(10);
		tree.root.leftChild = new TreeNode(20);
		tree.root.rightChild = new TreeNode(30);
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.root = new TreeNode(10);
		tree1.root.leftChild = new TreeNode(30);
		tree1.root.rightChild = new TreeNode(20);
		boolean mirror = isIdenticalTree(tree.root, tree1.root);
		System.out.println("Identical " + mirror);
	}

	private static boolean isIdenticalTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.data == root2.data) {
			return isIdenticalTree(root1.leftChild, root2.leftChild)
					&& isIdenticalTree(root2.rightChild, root1.rightChild);
		} else {
			return false;
		}
	}
}
