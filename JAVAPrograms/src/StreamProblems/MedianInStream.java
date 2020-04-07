package StreamProblems;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * https://algorithmsandme.com/median-of-integers-stream/
 */
public class MedianInStream {

	static PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());   //root maxelement (1st half data)
	static PriorityQueue<Integer> minHeap=new PriorityQueue<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr = new int[]{5, 15, 10, 20, 3}; 
		for(int i=0;i<arr.length;i++){
		add(arr[i]);
		System.out.println(getMedian()+" ");
		}
	}

	private static double getMedian() {
		// TODO Auto-generated method stub
		if(maxHeap.size()==minHeap.size()){
			return (double)(maxHeap.peek()+minHeap.peek())/2;
		}
	     if(maxHeap.size()>minHeap.size()){
			return (double)maxHeap.peek();
		}
			return (double)minHeap.peek();
		
		
	}

	private static void add(int data) {
		// TODO Auto-generated method stub
		maxHeap.add(data);
		if(maxHeap.size()-minHeap.size()>1 || (minHeap.size()>0 && maxHeap.peek()>minHeap.peek())){
			minHeap.offer(maxHeap.poll());
		}
		if(minHeap.size()-maxHeap.size()>1){
			maxHeap.offer(minHeap.poll());
		}
	}

}
