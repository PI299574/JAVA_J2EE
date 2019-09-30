package Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
//Comparable=java.lang
/*A comparable object is capable of comparing itself with another object.
The class itself must implements the java.lang.Comparable interface to compare its instances

To summarize, if sorting of objects needs to be based on natural order then use Comparable
whereas if you sorting needs to be done on attributes of different objects, then use Comparator in Java..*/

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*System.out.println(this.id);
		System.out.println(o.id);
		System.out.println((this.id-o.id));
		*/
		//return (this.id-o.id);
		return this.name.compareTo(o.name);
	}
	
	
}

public class ObjectSortingComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		Employee emp1=new Employee(12, "amit", 20);
		Employee emp2=new Employee(11, "vikash", 24);
		Employee emp3=new Employee(10, "prakash", 23);
		Employee emp4=new Employee(4, "Manish", 19);
		Employee emp5=new Employee(5, "Ankit", 21);
		
		ArrayList<Employee> empArray=new ArrayList<>();
		empArray.add(emp1);
		empArray.add(emp2);
		empArray.add(emp3);
		empArray.add(emp4);
		empArray.add(emp5);
		
		//emp1.compareTo(emp2);
		Collections.sort(empArray);
		for(Employee e: empArray)
		{System.out.println(e.toString());}
		
	}

}
