package MultiThreading;

import java.util.concurrent.CountDownLatch;
/*CountDownLatch is used to make sure that a task waits for other threads before it starts.
To understand its application, let us consider a server where the main task can only start when all the required services have started.

Working of CountDownLatch:
When we create an object of CountDownLatch, we specify the number of threads it should wait for, all such thread are required to do count down by
calling CountDownLatch.countDown() once they are completed or ready to the job. As soon as count reaches zero, the waiting task starts running.*/
class Worker extends Thread{
	private int delay;
	private CountDownLatch latch;
	public Worker(int delay,String name,CountDownLatch latch){
		super(name);
		this.delay=delay;
		this.latch=latch;
	}
	public void run(){
		try{
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(latch.getCount());
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("current thread has completed execution "+Thread.currentThread().getName());
		
	}
}

public class CountDownLatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch latch=new CountDownLatch(3);
		Worker w1=new Worker(1000, "worker1", latch);
		Worker w2=new Worker(2000, "worker2", latch);
		Worker w3=new Worker(3000, "worker3", latch);
		
		w1.start();
		w2.start();
		w3.start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread has finish execution "+Thread.currentThread().getName());
		
	}
	

}

/*
CountDownLatch works in latch principle, main thread will wait until Gate is open.
One thread waits for n number of threads specified while creating CountDownLatch in Java. 
Any thread, usually main thread of application,  which calls CountDownLatch.await() will 
wait until count reaches zero or its interrupted by another Thread. All other thread are 
required to do count down by calling CountDownLatch.countDown() once they are completed or 
ready to the job. as soon as count reaches zero, Thread awaiting starts running. One of the 
disadvantage of CountDownLatch is that its not reusable once count reaches to zero you can not 
use CountDownLatch any more, but don't worry Java concurrency API has another concurrent utility
called CyclicBarrier for such requirements.

When should we use CountDownLatch in Java :
Use CountDownLatch when one of Thread like main thread, require to wait for one or more thread to complete, 
before its start doing processing. Classical example of using CountDownLatch in Java  is any server side core Java application
which uses services architecture,  where multiple services is provided by multiple threads and application can not start processing
until all services have started successfully as shown in our CountDownLatch example.


CountDownLatch in Java – Things to remember
Few points about Java CountDownLatch which is worth remembering:

1) You can not reuse CountDownLatch once count is reaches to zero, this is the main difference between CountDownLatch and CyclicBarrier, 
which is frequently asked in core Java interviews and multi-threading  interviews.

2) Main Thread wait on Latch by calling CountDownLatch.await() method while other thread calls CountDownLatch.countDown() to inform that they have completed.
*/
