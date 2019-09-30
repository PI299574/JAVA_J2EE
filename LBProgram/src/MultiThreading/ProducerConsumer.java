package MultiThreading;

class Queue{
	
	boolean busy=false;
	int data;
	synchronized void put(int data){
	
		if(busy){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("exception caught");
			}
		}
		this.data=data;
		busy=true;
		notify();
		}
	
	
	synchronized int get(){
		if(!busy){
		try{
			wait();
		}
		catch(InterruptedException e){
			System.out.println("exception caught");
		}
	}
		System.out.println("Got "+data);
		busy=false;
		notify();
		return data;
	
	
}

}
public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
