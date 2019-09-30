package MultiThreading;

/*a CyclicBarrier is used when multiple thread carry out different sub tasks 
and the output of these sub tasks need to be combined to form the final output. 
After completing its execution, threads call await() method and wait for other threads to reach the barrier. 
Once all the threads have reached, the barriers then give the way for threads to proceed.*/

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
class Sum implements  Runnable {
	static int sum=0;
	public void run() {
		sum=10+20;
		try {
			CyclicBarrierExample.barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Product implements Runnable{
static int product =0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		product=10*20;
		try {
			CyclicBarrierExample.barrier.await(5000,TimeUnit.MILLISECONDS);
			System.out.println("No of parties at waiting for barrier at this point is"+CyclicBarrierExample.barrier.getNumberWaiting());
		} catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class CyclicBarrierExample implements Runnable {
	static CyclicBarrier barrier = new CyclicBarrier(3);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CyclicBarrierExample test=new CyclicBarrierExample();
		
		Thread t=new Thread(test);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("No of parties at waiting for barrier at this point is"+this.barrier.getParties());
		System.out.println("Before barrier Sum is "+Sum.sum);
		System.out.println("Before barrier Product is "+Product.product);
		Sum s1=new Sum();
		Thread t1=new Thread(s1);
		Product p1=new Product();
		Thread t2=new Thread(p1);
		t1.start();
		t2.start();
		
		try {
			this.barrier.await();
			
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after barrier Sum is "+Sum.sum);
		System.out.println("After barrier Product is "+Product.product);
		System.out.println("No of parties at waiting for barrier at this point is last"+this.barrier.getNumberWaiting());
	}

}
