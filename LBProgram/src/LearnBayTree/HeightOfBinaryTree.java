package LearnBayTree;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();
		tree.root=new TreeNode(10);
		tree.root.leftChild=new TreeNode(20);
		tree.root.rightChild=new TreeNode(30);
		//tree.root.rightChild.rightChild=new TreeNode(40);
		Integer element=30;
		int height=findHeight(tree.root);
		System.out.println("Height is "+height);
	}

	private static int findHeight(TreeNode root) {
		// TODO Auto-generated method stub
		int height=0;
		if(null==root){
			return 0;
		}else{
			int leftheight=1+findHeight(root.leftChild);
			int rightheight=1+findHeight(root.rightChild);
			if(height<rightheight){
				height=rightheight;
			}
			if(height<leftheight){
				height=leftheight;
			}
		}
		return height;
	}

}
