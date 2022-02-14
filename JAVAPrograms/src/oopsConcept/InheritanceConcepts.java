package oopsConcept;


class A{
   A(){
	   System.out.println("A");
   }
	static {
		System.out.println("s1");
	}
	void m1(){
		System.out.println("m1");
	}
}

class B extends A{
	
	B(){
		System.out.println("B");
	}
	static {
		System.out.println("s2");
	}
	void m1(){
		System.out.println("m2");
	}
}



public class InheritanceConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 A a=new B();
	     a.m1();
		
	}

}
