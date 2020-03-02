package InterviewQuestion;

class Employee{
	int id;
	String name;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Emp********88");
	}
}

public class TestObject {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new Employee();
      Employee e2=e1;
      e2=null;
      System.out.println(e1);
      System.out.println(e2);
	}
	

}
