package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}

public class CompratorexampleUsuingLabda {

	private static void printEmp1(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1, "pintu", 5000);
		Employee e2=new Employee(2, "amit", 1000);
		Employee e3=new Employee(3, "rakesh", 6000);

		List<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		Collections.sort(empList,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});


		empList.forEach((e)->{
			System.out.println(e.toString());
		});

		System.out.println("Using method reference ");
		empList.forEach((e)->printEmp(e));

		System.out.println("Usuing this reference ");
		//empList.forEach(this::printEmp1);  //can not use it from static context

	}

	private static void printEmp(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}

}
