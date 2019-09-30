package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//ExecutorService: is a interface which extends executor interface.

//executor and ExecutorService are used for creating thread ,starting and managing life cycle of thread.
//Executor creates pool of threads and manages life cycle of all threads in it. 
//java.util.concurrent.Executor interface defines very important execute() method which executes command in java.
//An Executor interface provides following type of methods in java >
//methods for managing termination and 
//methods that can produce a Future for tracking progress of tasks.
/*	void execute(Runnable command)
Executes the given command. Executor may execute command in a 
new thread, or
in a pooled thread, or 
in the calling thread
at the discretion of the Executor implementation in java*/

class MyRunnable implements Runnable{

	 int taskNo;
	 MyRunnable(int taskNo)
	 {
		 this.taskNo=taskNo;
	 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Currently Running Thread "+ taskNo +" "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Currently Running Thread "+ taskNo +" has finished its execution "+Thread.currentThread().getName());
	}
	
}


public class ExecuterServiceExample {

	public static int noOfThread=2;
	public static int totalTask=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//executor created with 2 thread.
		//2 thread in executor will execute 10 task and at a time only 2 thread will get executed
		//ExecutorService: is a interface which extends executor interface.
		//Executors class.: A fixed thread pool can be obtainted by calling the static newFixedThreadPool() method of Executors class.
		ExecutorService executor=Executors.newFixedThreadPool(noOfThread);
		for(int i=0;i<totalTask;i++){
			MyRunnable thread=new MyRunnable(i);
			executor.execute(thread);
		}
		
		executor.shutdown(); 
		//Initiates shutdown of executor, previously submitted tasks are executed, but no new tasks will be accepted in java
		//We must shutdown executor after executing tasks.
	}

}
