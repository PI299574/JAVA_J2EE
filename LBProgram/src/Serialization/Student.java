package Serialization;

import java.io.Serializable;

public class Student implements Serializable{

	public int id;
	public String name;
	public static int a;
	public transient int b;
	
	public Student(int id, String name,int a,int b) {
		this.id = id;
		this.name = name;
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",a=" + a + ", b=" + b + "]";
	}	
}
