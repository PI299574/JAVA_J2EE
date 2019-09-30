package Clonable;

public class ClientTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1=new  Student(1, "Amit");
		System.out.println("Student is "+s1.toString());
		Student s2=s1.Clone();
		//Student s2=s1;
		s2.id=2;
		System.out.println("Clone Student2 is "+s2.toString());
		System.out.println("Student1 is "+s1.toString());
	}

}
