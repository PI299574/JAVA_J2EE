package LearnBayQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class ReverseQueue {


	
	private static Queue reverse(Queue queue) {
		// TODO Auto-generated method stub
		
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		while(!queue.isEmpty()){
			stack.push((Integer) queue.remove());
		}
		
		while(!stack.isEmpty()){
			queue.add(stack.pop());
			//System.out.println(stack.pop());
		}
		return queue;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Queue<Integer> queue = new LinkedList<Integer> ();

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();
			}
		
		for(int i=0;i<n;i++){
			
		queue.add(arr[i]);
		}
		
		queue=reverse(queue);
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
	}

	

}
