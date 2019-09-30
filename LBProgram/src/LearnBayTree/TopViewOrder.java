package LearnBayTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopViewOrder {

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
  
  topviewIterative(tree.root,0);
 // topViewrecursive(tree.root,0);
	for(Map.Entry<Integer, Integer> m:map.entrySet()){
		System.out.println("height " +m.getKey());
		System.out.println("data " +m.getValue());
	}
	
	
	
	}

	private static void topviewIterative(TreeNode root, int height) {
		// TODO Auto-generated method stub
		
   queuepair current=new queuepair(root, height) ;
   Queue<queuepair> queue=new LinkedList<>();
   HashMap<Integer,Integer> map=new HashMap<>();
   if(null==root){
	   return;
   }
   else{
	   queue.offer(current);
	   while(!queue.isEmpty()){
	   
	   current=queue.poll();
	   root=current.root;
	   height=current.height;
	   if(map.containsKey(height)){
		   
	   }else{
		   map.put(height, root.data);
	   }
	   if(null!=root.leftChild){
		   current=new queuepair(root.leftChild, height-1);
		   queue.offer(current);
	   }
	   if(null!=root.rightChild){
		   current=new queuepair(root.rightChild, height+1);
		   queue.offer(current);
	   }
	   }
	   
	   for(Map.Entry<Integer, Integer> m:map.entrySet()){
			System.out.println("height " +m.getKey());
			System.out.println("node is  " +m.getValue());
		}
   }
		
	}

	public static HashMap<Integer,Integer> map=new HashMap<>(); 
	private static void topViewrecursive(TreeNode root, int height) {
		// TODO Auto-generated method stub
		if(null==root){
			return;
		}else{
			if(map.containsKey(height)){
				
			}else{
				map.put(height, root.data);
			}
			
			topViewrecursive(root.leftChild,height-1);
			topViewrecursive(root.rightChild,height+1);
		}
		
	}

}
