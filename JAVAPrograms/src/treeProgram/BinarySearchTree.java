package treeProgram;

public class BinarySearchTree {

	

	TreeNode root; 

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
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
				}
				if (current.data < data) {
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

	public void insertRecursive(int data) {
		root = insertdata(root, data);
	}

	private TreeNode insertdata(TreeNode root, int data) {
		// TODO Auto-generated method stub
		if (null == root) {
			root = new TreeNode(data);
			return root;
		}
		if (data < root.data) {
			root.leftChild = insertdata(root.leftChild, data);
		} else {
			root.rightChild = insertdata(root.rightChild, data);
		}
		return root;
	}

	public TreeNode searchdata(int data) {
		TreeNode current = root;

		while (null != current && current.data != data) {
			if (current.data > data) {
				current = current.leftChild;
			}
			current = current.rightChild;
		}
		return current;
	}
}
