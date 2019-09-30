package MultiThreading;


/*The join() method is used to hold the execution of currently running thread until the specified thread is dead(finished execution)
Why we use join() method?
In normal circumstances we generally have more than one thread, thread scheduler schedules the threads, 
which does not guarantee the order of execution of threads.
How can we make sure that the threads executes in a particular order. The Answer is: By using join() method appropriately.*/
public class JoinExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*Thread
		public Thread(Runnable target,String name)
		Allocates a new Thread object. This constructor has the same effect as Thread (null, target, name).
		Parameters: 
		target - the object whose run method is invoked when this thread is started. If null, this thread's run method is invoked. 
		name - the name of the new thread */
		Thread th1=new Thread(new MyClass(), "th1");
		Thread th2=new Thread(new MyClass(), "th2");
		Thread th3=new Thread(new MyClass(), "th3");
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th3.start();
		try {
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All thread has finished execution ");
	}

}


class MyClass implements Runnable{
	
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println("current thread is "+t.getName());
		
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("ended execution of thread "+t.getName());
	}
	
}