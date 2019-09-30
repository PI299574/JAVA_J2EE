package LearnBayTree;

import java.util.ArrayList;
import java.util.Stack;

public class BinarySearchTree {

	TreeNode root;

	public void insert(int data) {
		TreeNode newNode = new TreeNode(data);

		if (null == root) {
			root = newNode;
		} else {
			TreeNode current = root;
			TreeNode parent;
			while (true) {  

				if (data < current.data) {
					parent = current;
					current = current.leftChild;
					if (null == current) {
						parent.leftChild = newNode;
						return;
					}
				}

				if (data > current.data) {
					parent = current;
					current = current.rightChild;
					if (null == current) {
						parent.rightChild = newNode;
						return;
					}

				}
			}

		}
	}

	public void insertRecursive(int data) {
		root = insertRec(root, data);
		/// System.out.println("Inserted node "+node.data); //print root node
	}

	public TreeNode insertRec(TreeNode node, int data) {
		if (null == node) {
			node = new TreeNode(data);
		} else {
			if (data <= node.data) {
				node.leftChild = insertRec(node.leftChild, data);
			} else {
				node.rightChild = insertRec(node.rightChild, data);
			}
		}
		return node; // return root node as backtarcking .

	}

	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data +" ");
			
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}
	}

	public int countNode(TreeNode node) {
		if (null == node) {
			return 0;
		} else {
			return 1 + countNode(node.leftChild) + countNode(node.rightChild);
		}
	}

	public int countAllLeafNode(TreeNode node) {

		if (null == node) {
			return 0;
		} else if (null == node.leftChild && null == node.rightChild) {
			return 1;
		} else {
			return countAllLeafNode(node.leftChild) + countAllLeafNode(node.rightChild);
		}
	}

	public int countAllhalfLeafNode(TreeNode node) {

		if (null == node) {
			return 0;
		} else if ((null == node.leftChild && null != node.rightChild)
				|| (null != node.leftChild && null == node.rightChild)) {
			return 1;
		} else {
			return countAllhalfLeafNode(node.leftChild) + countAllhalfLeafNode(node.rightChild);
		}
	}

	public ArrayList<Integer> preOrderwithoutrecursion(TreeNode root) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();
		if (null == root) {
			return null;
		} else {
			stack.push(root);
			while (!stack.isEmpty()) {
				TreeNode node=stack.pop();
				arrayList.add(node.data);
               //System.out.print(node.data +" ");
			
			if (null != node.rightChild) {
				stack.push(node.rightChild);
			}
				if (null != node.leftChild) {
					stack.push(node.leftChild);
				}
				
			}
		}
		return arrayList;

	}

	
	public int findMaxElement(TreeNode node){
	
		int max=0;
		if(null != node){
			if(max < node.data){
				max=node.data;
			}
		
		int leftmax=findMaxElement(node.leftChild);
		int rightmax=findMaxElement(node.rightChild);
		
		if(max<rightmax){
			max=rightmax;
		}
		else if(max<leftmax) {
			max=leftmax;
		}
		}
		return max;
	}
	
	public TreeNode searchData(int data) {
		TreeNode current = root;
		while (null != current && data != current.data) {
			if (data > current.data) {
				current = current.rightChild;
			} else {
				current = current.leftChild;
			}

		}
		return current;
	}

}
