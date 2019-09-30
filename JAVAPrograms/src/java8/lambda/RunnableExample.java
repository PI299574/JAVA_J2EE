package java8.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello world from inner class");
			}
		});

		t.run();
		Thread t1=new Thread(()->System.out.println("Hello world from Lambda implementation"));
		t1.run();
	}



}
