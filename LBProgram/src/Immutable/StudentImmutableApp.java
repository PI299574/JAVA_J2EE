package Immutable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class StudentImmutableApp  {

	public static void main(String[] args) throws
    CloneNotSupportedException, NoSuchFieldException, SecurityException, IllegalArgumentException, Exception{
		// TODO Auto-generated method stub
//
//		List book=new ArrayList<>();
//		book.add("xyz");
//		book.add("abc");
		
		List<Book> book=new ArrayList<Book>();
		Book b1=new Book();
		b1.setBookname("x1");
		book.add(b1);
		
		
		
		Address address=new Address();
		address.setHouseName("palm");
		address.setHouseNo(1);
		//System.out.println(address.toString());
		Student s1=new Student(20, 1, "amit",book,address);
		
		Student s2=(Student) s1.clone();
	
		 
		//s1.age=40;  //giving compilation error
		 
		 
		 System.out.println("Before student obect is ********");
		 System.out.println(s1.toString());
		 System.out.println("After adding one more book in list and updating addressname of address is ******");  
		// s1.book.add("abcd");
		 
		 Book b2=new Book();
		 b2.setBookname("Y1");
		s1.getBook().add(b2);
		 
		 s1.getAddress().setHouseName("Bagicha");
		 
		 System.out.println(s1.toString());
		 
		 
		 //changing content of immutable object ...Method 1
		 System.out.println("after modidying name ");
		 Class cls=s1.getClass();
		Field filed= cls.getDeclaredField("name");
		filed.setAccessible(true);
		filed.set(s1,"pintu");
		 System.out.println(s1.toString());
		 
		 
	}

}
