package exceptionHandling;

import java.io.IOException;

class A{
	public void m1() throws Exception{
		System.out.println("Base***");
	}
}
class B extends A{
	@Override
	public void m1() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Child***");
	}
}

public class IOExceptionCase {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A a =new B();
		a.m1();
	}

}
