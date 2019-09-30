package LearnBayTree;

public class AVLTreeNode {

	AVLTreeNode leftChild;
	AVLTreeNode rightChild;
	int data;
	int height;
	
	public AVLTreeNode(int data){
		leftChild=null;
		rightChild=null;
		this.data=data;
		height=1;
	}
	
}
