package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/*Serialization is a mechanism of converting the state of an object into a byte stream. 
Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
Deserialization mechanism is used to persist the object.*/
/*
To make a Java object serializable we implement the java.io.Serializable interface.
The ObjectOutputStream class contains writeObject() method for serializing an Object.
public final void writeObject(Object obj) throws IOException
The ObjectInputStream class contains readObject() method for deserializing an object.
public final Object readObject() throws IOException, ClassNotFoundException*/







public class SeriallizationClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s=new Student(1, "Akash",10,20);
		
		FileOutputStream file=new FileOutputStream("file.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		
		out.writeObject(s);
		out.flush();
		System.out.println("success");
		s.a=100;   //changed static valiable value
		System.out.println("Seriallized object is "+s.toString());
	}

}
