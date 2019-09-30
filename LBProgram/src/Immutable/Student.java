package Immutable;

import java.util.ArrayList;
import java.util.List;


/*. How Do We Create an Immutable Class
In order to create an immutable class, you should follow the below steps:
1.       Make your class final, so that no other classes can extend it.
2.	Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
3.	Don’t expose setter methods.
4.	When exposing methods which modify the state of the class, you must always return a new instance of the class.
5.	If the class holds a mutable object:
o	Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, 
this is to prevent the clients who pass the object from modifying it afterwards.
o	Make sure to always return a clone copy of the field and never return the real object instance.
*/
final class Student implements Cloneable{

	final int age;
	final int id;
	final String name;
	final List<Book> book;
	
	final Address address;
 
	public Student(int age, int id, String name, List<Book> book,Address address) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
		
		
		//this.book = book;
		List<Book> clonebook=new ArrayList<>(book);
		
		//clonebook.add(this.book);
		this.book= clonebook;
		//this.address=address;
		Address cloneaddress=new Address();
		cloneaddress.setHouseName(address.getHouseName());
		cloneaddress.setHouseNo(address.getHouseNo());
		this.address= cloneaddress;
	}
	
	public int getAge() {
		return age;
	}
	

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
	/*public List getBook() {
		return book;
	}*/
	public List getBook() {
		//return book;
		List clonebook=new ArrayList<>(this.book);
		
		//clonebook.add(this.book);
		return clonebook;
	}
	
	/*public Address getAddress() {
		return address;
	}*/
	public Address getAddress() {
		Address cloneaddress=new Address();
		address.setHouseName(this.address.getHouseName());
		address.setHouseNo(this.address.getHouseNo());
		return cloneaddress;
	}

	public Object clone() throws
    CloneNotSupportedException
{
return super.clone();
}

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + ", book=" + book.toString() + ", address=" + address.toString()
				+ "]";
	}

	
	
}
