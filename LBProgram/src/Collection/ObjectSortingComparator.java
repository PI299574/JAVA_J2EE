package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//comparator=java.utill\
/*Implementing Comparable means "I can compare myself with another object." 
This is typically useful when there's a single natural default comparison.

Implementing Comparator means "I can compare two other objects." 
This is typically useful when there are multiple ways of comparing two instances of a type - e.g. you could compare people by age, name etc.
*/

/*Unlike Comparable, Comparator is external to the element type we are comparing. 
It’s a separate class. We create multiple separate classes (that implement Comparator) to compare by different members.

Collections class has a second sort() method and it takes Comparator. The sort() method invokes the compare() to sort objects.

To compare movies by Rating, we need to do 3 things :

Create a class that implements Comparator (and thus the compare() method that does the work previously done by compareTo()).
Make an instance of the Comparator class.
Call the overloaded sort() method, giving it both the list and the instance of the class that implements Comparator.*/

class Employe {
	int id;
	String name;
	int age;
	public Employe(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	/*public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

*/

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

class IdComparator1  implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return (int)(o1.id-o2.id);
	}
	
}

class nameComparator implements Comparator<Employe>{

	@Override
	public int compare(Employe obj1, Employe obj2) {
		// TODO Auto-generated method stub
		return obj1.name.compareTo(obj2.name);
	}
	
}

class IdThenNameComparator implements Comparator<Employe>{

	@Override
	public int compare(Employe e1, Employe e2) {
		// TODO Auto-generated method stub
		
		int flag=e1.id-e2.id;
		if(flag==0){
			flag=e1.name.compareTo(e2.name);
		}
		return flag;
	}
	
}



public class ObjectSortingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employe emp1=new Employe(12, "amit", 20);
		Employe emp2=new Employe(11, "vikash", 24);
		Employe emp3=new Employe(10, "prakash", 23);
		Employe emp4=new Employe(4, "manish", 19);
		Employe emp5=new Employe(4, "ankit", 21);
		
		ArrayList<Employe> empArray=new ArrayList<>();
		empArray.add(emp1);
		empArray.add(emp2);
		empArray.add(emp3);
		empArray.add(emp4);
		empArray.add(emp5);
		
		Collections.sort(empArray, new IdThenNameComparator());
		
		for(Employe e:empArray){
			System.out.println(e);
		}
		
		//emp1.compareTo(emp2);
		Collections.sort(empArray, new IdComparator1());
		
		System.out.println("sorted Employee based on id"+ empArray.toString());
		
		Collections.sort(empArray, new nameComparator());
		
		System.out.println("sorted Employee based on name"+ empArray.toString());
	}

}
