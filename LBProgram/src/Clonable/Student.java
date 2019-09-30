package Clonable;

public class Student implements Cloneable {

	 int id;
	 String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public Student Clone() throws CloneNotSupportedException{
		return (Student) super.clone();
		
	}
}
