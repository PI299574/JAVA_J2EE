package multithreading;

public class DeadLockExample {

}
/*
  This is very important question from interview perspective. But, what makes this question important is it checks interviewees capability of creating and detecting deadlock. If you can write a code to form deadlock, than I am sure you must be well capable in solving that deadlock as well. If not, later on this post we will learn how to solve deadlock as well.
First question comes to mind is, what is deadlock in multi threading program?
Deadlock is a situation where two threads are waiting for each other to release lock holded by them on resources.

Deadlock creation - how deadlock could be formed in multithreading:

Thread-1 acquires lock on String.class and then calls sleep() method which gives Thread-2 the chance to execute immediately after Thread-1 has acquired lock on String.class and Thread-2 acquires lock on Object.class then calls sleep() method and now it waits for Thread-1 to release lock on String.class.
Conclusion:
Now, Thread-1 is waiting for Thread-2 to release lock on Object.class and Thread-2 is waiting for Thread-1 to release lock on String.class and deadlock is formed.
Code called by Thread-1
   
 public void run() {
           synchronized (String.class) {
                    Thread.sleep(100);
                  synchronized (Object.class) { 
                  }
           } 
 }

Code called by Thread-2
   
    public void run() {
           synchronized (Object.class) {
                    Thread.sleep(100);
                  synchronized (String.class) {
                  }
           } 
 }



Full Program to create Deadlock in multithreading environment >
class A implements Runnable{
    public void run() {
           
           synchronized (String.class) {
                  
                  /*
                   * Adding this optional delay so that Thread-2 could enough time
                   * to lock Object class and form deadlock.
                   * If you remove this sleep, because of threads unpredictable
                   * behavior it might that Thread-1
                   * gets completed even before Thread-2 is started and we will
                   * never form deadLock.
                   
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {e.printStackTrace();}
                  
                  System.out.println(Thread.currentThread().getName() + "has acquired lock "
                            + "on String class and waiting to acquire lock on Object class...");
                  synchronized (Object.class) {
                        System.out.println(Thread.currentThread().getName() +
                                      " has acquired lock on Object class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 
class B extends Thread{
    public void run() {
           
           synchronized (Object.class) {  
                  System.out.println(Thread.currentThread().getName() + " has acquired "
                      + "lock on Object class and waiting to acquire lock on String class...");
                  
                  /*
                   * Adding this optional delay so that Thread-1 could enough
                   * time to lock String class and form deadlock.
                   * If you remove this sleep, because of threads unpredictable
                   * behavior it might that Thread-2
                   * gets completed even before Thread-1 is started and we
                   * will never form deadLock.
                   
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {e.printStackTrace();}
                  
                  
                  synchronized (String.class) {
                        System.out.println(Thread.currentThread().getName() +
                                      " has acquired lock on String class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+ " has ENDED");
    }
}
 

public class DeadlockCreation {
 
    public static void main(String[] args) {
           Thread thread1 = new Thread(new A(), "Thread-1");
           Thread thread2 = new Thread(new B(), "Thread-2");
           thread1.start();
           thread2.start();
    }
 
}
 
/*OUTPUT
    
Thread-2 has acquired lock on Object class and waiting to acquire lock on String class...
Thread-1 has acquired lock on String class and waiting to acquire lock on Object class...
 
    
What happened in above program was Thread-1 was waiting for Thread-2 to release lock on Object.class and Thread-2 was waiting for Thread-1 to release lock on String.class and deadlock was formed. One more crucial thing to note down in output was " has ENDED" was never printed in output, because of deadlock Thread-1 & Thread-2 never ended.


Solving deadlock - Here comes the important part, how above formed deadlock could be solved :

Thread-1 acquires lock on String.class and then calls sleep() method which gives Thread-2 the chance to execute immediately after Thread-1 has acquired lock on String.class and Thread-2 tries to acquire lock on String.class but lock is holded by Thread-1. Meanwhile, Thread-1 completes successfully. As Thread-1 has completed successfully it releases lock on String.class, 
Thread-2 can now acquire lock on String.class and complete successfully without any deadlock formation.
Conclusion: No deadlock is formed.
Code called by Thread-1
   
 public void run() {
           synchronized (String.class) {
                    Thread.sleep(100);
                  synchronized (Object.class) { 
                  }
           } 
 }

Code called by Thread-2
   
    public void run() {
           synchronized (String.class) {
                    Thread.sleep(100);
                  synchronized (Object.class) {
                  }
           } 
 }



Full Program to solve Deadlock created in above program>
class A implements Runnable{
    public void run() {
           
           synchronized (String.class) {
                  //using Thread.sleep(100); // is optional.
                  System.out.println(Thread.currentThread().getName() + " has acquired lock "
                            + "on String class and waiting to acquire lock on Object class...");
                  synchronized (Object.class) {
                        System.out.println(Thread.currentThread().getName()+" has acquired "
                                      + "lock on Object class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 
class B extends Thread{
    public void run() {
           
           synchronized (String.class) {  
                  System.out.println(Thread.currentThread().getName()+" has acquired lock on "
                              + "Object class and waiting to acquire lock on String class...");
                  
                  synchronized (Object.class) {
                        System.out.println(Thread.currentThread().getName()+" has acquired "
                                      + "lock on String class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 

public class DeadlockSolution {
 
    public static void main(String[] args) {
           Thread thread1=new Thread(new A(),"Thread-1");
           Thread thread2=new Thread(new B(),"Thread-2");
           thread1.start();
           thread2.start();
    }
 
}
 
/*OUTPUT
    
Thread-1 has acquired lock on String class and waiting to acquire lock on Object class...
Thread-1 has acquired lock on Object class
Thread-1 has ENDED
Thread-2 has acquired lock on Object class and waiting to acquire lock on String class...
Thread-2 has acquired lock on String class
Thread-2 has ENDED
 
*

What happened in above program was Thread-1 acquired lock on String.class
 and then called sleep() method which gave Thread-2 the chance to execute immediately
 \ after Thread-1 acquired lock on String.class and then Thread-2 tried to acquire lock on String.class but lock was holded by Thread-1. Meanwhile, Thread-1 completed successfully. As Thread-1 completed successfully it released lock on String.class, Thread-2 then acquired lock on String.class and completed successfully. Hence, neither of the thread waited for each other to release locks and ended without any deadlock formation.
One more crucial thing to note down in output was " has ENDED" was printed in output,
 because Thread-1 & Thread-2 completed successfully.


Few important measures to avoid Deadlock >

    Lock specific member variables of class rather than locking whole class: We must try to lock specific member variables of class rather than locking whole class.

 Example : Let’s say we have a class
  class CustomClass{
    Integer i;
    String str;
}
  Now rather than locking object of whole CustomClass try to lock specific fields which we want to synchronize.

Avoid such kind of locking :
CustomClass customClassObj=new CustomClass();
synchronized (customClassObj) {
}

Try to use such kind of locking (locking specific member variable of class) :
synchronized (customClassObj.str) {
}


Benefit of using such kind of locks is that any other thread can easily operate on unlocked member variable of class and reduce risk of forming deadlock.

    Use join() method: If possible try to use join() method, although it may refrain us from taking full advantage of multithreading environment because threads will start and end sequentially, but it can be handy in avoiding deadlocks.

 Now,I am going to provide you with source code to give you a better picture of how join() method can be handy in avoiding deadlock in above used program.
 
class A implements Runnable{
    public void run() {
           
           synchronized (String.class) {
                  
                  /*
                   * Adding this optional delay so that Thread-2 could enough time to lock Object class and form deadlock.
                   * If you remove this sleep, because of threads unpredictable behavior it might that Thread-1
                   * gets completed even before Thread-2 is started and we will never form deadLock.
                   
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {e.printStackTrace();}
                  
                  System.out.println(Thread.currentThread().getName()+" has acquired lock on String class and waiting to acquire lock on Object class...");
                  synchronized (Object.class) {
                        System.out.println(Thread.currentThread().getName()+" has acquired lock on Object class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 
class B extends Thread{
    public void run() {
           
           synchronized (Object.class) {  
                  System.out.println(Thread.currentThread().getName()+" has acquired lock on Object class and waiting to acquire lock on String class...");
                  
                  /*
                   * Adding this optional delay so that Thread-1 could enough time to lock String class and form deadlock.
                   * If you remove this sleep, because of threads unpredictable behavior it might that Thread-2
                   * gets completed even before Thread-1 is started and we will never form deadLock.
                  
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {e.printStackTrace();}
                  
                  
                  synchronized (String.class) {
                        System.out.println(Thread.currentThread().getName()+" has acquired lock on String class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 
    public class DeadlockAvoidingUsingJoin {
 
           public static void main(String[] args) throws InterruptedException {
                  Thread thread1=new Thread(new A(),"Thread-1");
                  Thread thread2=new Thread(new B(),"Thread-2");
                  thread1.start();
                  thread1.join();
                  thread2.start();
           }
 
    }
 
/*OUTPUT
    
Thread-1 has acquired lock on String class and waiting to acquire lock on Object class...
Thread-1 has acquired lock on Object class
Thread-1 has ENDED
Thread-2 has acquired lock on Object class and waiting to acquire lock on String class...
Thread-2 has acquired lock on String class
Thread-2 has ENDED
 

What happened in the above program was, because of join() method Thread-1 
and Thread-2 started and ended sequentially. Thread-1 was able to finish even 
before Thread-2 was started and no deadlock was formed.



    If possible try avoid using nested synchronization blocks.



Just another illustration to create deadlock using inner classes 
(though it’s not going to be much different from deadlock logic creation 
		used in above programs, but it will give you just way of creating 
		deadlock using inner classes) >

public class DeadlockCreationUsingInnerClasses {
 
    public static void main(String[] args) {
           Thread thread1=new Thread("Thread-1"){ //inner class
                  public void run() {
                        
                        synchronized (String.class) {
                               
                               /*
                                * Adding this optional delay so that Thread-2 could enough time to lock Object class and form deadlock.
                                * If you remove this sleep, because of threads unpredictable behavior it might that Thread-1
                                * gets completed even before Thread-2 is started and we will never form deadLock.
                                
                               try {
                                      Thread.sleep(100);
                               } catch (InterruptedException e) {e.printStackTrace();}
                               
                               System.out.println(Thread.currentThread().getName()+" has acquired lock on String class and waiting to acquire lock on Object class...");
                               synchronized (Object.class) {
                                      System.out.println(Thread.currentThread().getName()+" has acquired lock on Object class");
                               }
                        }
                        
                        System.out.println(Thread.currentThread().getName()+" has ENDED");
                  }
 
           };
 
           Thread thread2=new Thread("Thread-2"){ //inner class
                  public void run() {
                        
                        synchronized (Object.class) {  
                               System.out.println(Thread.currentThread().getName()+" has acquired lock on Object class and waiting to acquire lock on String class...");
                               
                               /*
                                * Adding this optional delay so that Thread-1 could enough time to lock String class and form deadlock.
                                * If you remove this sleep, because of threads unpredictable behavior it might that Thread-2
                                * gets completed even before Thread-1 is started and we will never form deadLock.
                                
                               try {
                                      Thread.sleep(100);
                               } catch (InterruptedException e) {e.printStackTrace();}
                               
                               
                               synchronized (String.class) {
                                      System.out.println(Thread.currentThread().getName()+" has acquired lock on String class");
                               }
                        }
                        
                        System.out.println(Thread.currentThread().getName()+" has ENDED");
               }
 
           };
           thread1.start();
           thread2.start();
    }
 
}
 
/*OUTPUT
    
Thread-2 has acquired lock on Object class and waiting to acquire lock on String class...
Thread-1 has acquired lock on String class and waiting to acquire lock on Object class...
  
 



Detecting Deadlocks >

We can use following tools to generate

thread dumps and find out root cause of deadlock by analyzing thread dumps.

VisualVM  is most popular way to generate 
Thread Dump and is most widely used by developers. 
It’s important to understand usage of VisualVM for in depth knowledge 
of VisualVM. I’ll recommend every developer must understand this topic 
to become master in multi threading.
It helps us in analyzing threads performance, thread states, CPU consumed by threads, garbage collection and much more.  For detailed information see Generating and analyzing Thread Dumps using VisualVM - step by step detail to setup VisualVM with screenshots

jstack is very easy way to generate Thread dump and is widely used by developers. I’ll recommend every developer must understand this topic to become master in multi threading. For creating Thread dumps we need not to download any jar or any extra software. For detailed information see Generating and analyzing Thread Dumps using JSATCK - step by step detail to setup JSTACK with screenshots.
 
*/