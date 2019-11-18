package treeProgram;

import java.util.ArrayList;

public class LowestCommonAnchester {

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
		 Store all the data from root to one Node (N1) in one array and from root to another node (N2) in another array.
		 match the common data from these two array , See below
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		LCA(tree.root,80,70);
	}

	private static void LCA(TreeNode root, int n1, int n2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		if(null==root){
			return;
		}else{
			list1=getRootTonodedata(root,n1,list1);
			list2=getRootTonodedata(root,n2,list2);
			System.out.println(list1);
			System.out.println(list2);
		}
		if(list1!=null && list2!=null){
			int i = 0,j=0;
			while(i<list1.size() && j<list2.size()){
				if(list1.get(i)==list2.get(j)){
					i++;j++;
				}else{
					break;
				}
			}
			System.out.println("LCA is "+list1.get(i-1));
		}
	}

	private static ArrayList<Integer> getRootTonodedata(TreeNode root, int n, ArrayList<Integer> list) {
		// TODO Auto-generated method stub

		if(null==root){
			return null;
		}else{
			while(n!=root.data){
				list.add(root.data);
				if(n<root.data && root.leftChild!=null){
					root=root.leftChild;
				}
				else if(n>root.data && root.rightChild!=null) {
					root=root.rightChild;
				}
			}
			list.add(n);
		}
		return list;
	}

}
