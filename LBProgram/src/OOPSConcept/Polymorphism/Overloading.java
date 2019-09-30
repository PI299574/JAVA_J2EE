package OOPSConcept.Polymorphism;

public class Overloading {

	
	public void add(int a,int b){
		System.out.println("primmiitive data type");
	}
	public void add(Integer a,Integer b){
		System.out.println("Wrapper data type");
	}
	public void add(long a,long b){
		System.out.println("long data type");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading();
		o.add(2,3);   //look for exact match , //primmitive data type
	}

}
