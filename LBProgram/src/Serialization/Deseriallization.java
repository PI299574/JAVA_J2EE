package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseriallization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("file.txt");
		ObjectInputStream in=new ObjectInputStream(file);
		
		Student s=(Student) in.readObject();
		in.close();
		System.out.println("Deseriallised object is "+s.toString());
	}

}
