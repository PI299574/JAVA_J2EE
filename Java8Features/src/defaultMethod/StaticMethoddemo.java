package defaultMethod;

interface StaticDemo{
	
	//public int square(int x);
	
	public void print();
	
	static void sayHello(){
		System.out.println("static method get executed");
	}
}

public class StaticMethoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* if uncomment below code, then will get error.
		StaticDemo sd=(x)->{
			return x*x;
		};*/
		
		//int y=sd.square(20);
		//System.out.println(y);
		StaticDemo sd1=()->{
			System.out.println("Hello");
		};
		sd1.print();
		StaticDemo.sayHello();
	}

}
