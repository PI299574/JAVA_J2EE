package StreamProblems;
import java.util.PriorityQueue;

/*
Given an infinite stream of integers, find the k’th largest element at any point of time. It may be assumed that 1 <= k <= n.

Input:
stream[] = {10, 20, 11, 70, 50, 40, 100, 5, ...}
k = 3
Output:    {_,   _, 10, 11, 20, 40, 50,  50, ...}


An Efficient Solution is to use Min Heap of size k to store k largest elements of stream. 
The k’th largest element is always at root and can be found in O(1) time.

How to process a new element of stream?
Compare the new element with root of heap. If new element is smaller, then ignore it. Otherwise replace root with new element and
 call heapify for the root of modified heap. Time complexity of finding the k’th largest element is O(Logk).
*/
public class KthLargestElementInStream {
	
	static int k=3;
	static PriorityQueue<Integer> pq=new PriorityQueue<>(k);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int stream[] = {10, 20, 11, 70, 50, 40, 100, 5};
		//int k=3;
		
		for(int i=0;i<stream.length;i++){
			int kth = add(stream[i]);
			System.out.print(" "+kth);
		}
		
	}

	private static Integer add(int data) {
		// TODO Auto-generated method stub
		if(pq.size()<k){
			pq.add(data);
		}
		
		else if(pq.peek()<data){
			pq.poll();
			pq.offer(data);
		}
		
		return pq.peek();
	}

}
