package java8.lambda;

public class MethodRefrenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t=new Thread(()->printMessage());  //noarg method usuing lambda expression calling no method arguments ....()->method()
		Thread t=new Thread(MethodRefrenceExample::printMessage);
		t.start();
	}
	public static void printMessage(){
		System.out.println("hello World!!");
	}
}
