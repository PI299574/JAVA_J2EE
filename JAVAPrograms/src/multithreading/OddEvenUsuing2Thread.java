package multithreading;

class oddEvenThread extends Thread{
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=1;i<=n;i++)
	synchronized (this) {
		
		if(i%2 !=0 && "ODD".equalsIgnoreCase(Thread.currentThread().getName())){
			System.out.println("ODD ****"+ Thread.currentThread().getName()+ " ***** "+i);
			notify();
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		else if(i%2 ==0 && "EVEN".equalsIgnoreCase(Thread.currentThread().getName())){
			System.out.println("EVEN ****"+ Thread.currentThread().getName()+ " ***** "+i);
			notify();
			
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	}
	}



public class OddEvenUsuing2Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //s
		oddEvenThread oddEven =new oddEvenThread();
		Thread t1=new Thread(oddEven,"ODD");
		Thread t2=new Thread(oddEven,"EVEN");
		t1.start();
		t2.start();
	}

}
