package treeProgram;

public class MaxPathSum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree=new BinarySearchTree();
	        tree.root = new TreeNode(10); 
	        tree.root.leftChild = new TreeNode(2); 
	        tree.root.rightChild = new TreeNode(10); 
	        tree.root.leftChild.leftChild = new TreeNode(20); 
	        tree.root.leftChild.rightChild = new TreeNode(1); 
	        tree.root.rightChild.rightChild = new TreeNode(-25); 
	        tree.root.rightChild.rightChild.leftChild = new TreeNode(3); 
	        tree.root.rightChild.rightChild.rightChild = new TreeNode(4); 
	        System.out.println("maximum path sum is : " + 
	                            findMaxSum(tree.root)); 
	}
	
	//static int result=Integer.MIN_VALUE;
	private static int findMaxSum(TreeNode root) {
		// TODO Auto-generated method stub
		
		int []res=new int[1];
		res[0]=Integer.MIN_VALUE;
		findMax(root,res);
		return res[0];
	}
	private static int findMax(TreeNode root, int[] result) {
		// TODO Auto-generated method stub
		
		if(root==null){
			return 0;
		}
		int leftMax= findMax(root.leftChild, result);
		int rightmax=findMax(root.rightChild,result);
		
		int max_value=Math.max(root.data, root.data+Math.max(leftMax,rightmax ));
		
		int max_top = Math.max(max_value, root.data+leftMax+rightmax);
		result[0]=Math.max(result[0], max_top);
		return max_value;
		
	}

}
