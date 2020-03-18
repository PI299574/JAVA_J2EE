package InterviewQuestion;

public class NoOfwaytoCreateObjectinJAVA {

}
/*
 
How many Ways to Create an Object in Java

There are five different ways to create an object in Java:

    Java new Operator
    Java Class.newInstance() method
    Java newInstance() method of constructor
    Java Object.clone() method
    Java Object Serialization and Deserialization

1) Java new Operator

This is the most popular way to create an object in Java. A new operator is also followed by a call to constructor which initializes the new object. While we create an object it occupies space in the heap.

Syntax

    class_name object_name = new class_name()  

Example of Java new Operator

    public class A  
    {  
    String str="hello";  
    public static void main(String args[])  
    {  
    A obj=new A();  //creating object using new keyword  
    System.out.println(obj.str);  
    }  
    }  

Output:
How many Ways to Create an Object in Java
2) Java Class.newInstance() method

Java Class.newInstance() is the method of Class class. The Class class belongs to java.lang package. It creates a new instance of the class represented by this Class object. It returns the newly created instance of the class.

Syntax

    public T newInstance() throws IllegalAcccessException, InstantiationException  

It throws IllegalAccessException if the class or its nullary constructor is not accessible. It also throws InstantiationException, if the Class represents an abstract class, an interface, an array class, or a primitive type.

Example

    public class NewInstanceExample  
    {  
    String str="hello";  
    public static void main(String args[])  
    {  
    try  
    {  
    //creating object of class  
    NewInstanceExample obj= NewInstanceExample.class.newInstance();   
    System.out.println(obj.str);          
    }  
    catch(Exception e)  
    {  
    e.printStackTrace();  
    }  
    }  
    }  

Output:
How many Ways to Create an Object in Java
3) Java newInstance() method of Constructor class

Java Constructor class also has a newInstance() method similar to newInstance() method of Class class. The newInstance() method belongs to java.lang.reflect.Constructor class. Both newInstance() method are known as reflective ways to create object. In fact the newInstance() method of Class class internally uses newInstance() method of Constructor class. The method returns a new object created by calling the constructor.

Syntax

    public T newInstance(Objects...initargs)  

The newInstance() method throws the following Exception:

    IllegalAccessException: If the constructor is inaccessible.
    IllegalArgumentException: If the actual and formal parameter differ in number.
    InstantiationException: If the class constructor represents an abstract class.
    InvocationTargetException: If the underlying constructor throws an exception.
    ExceptionInInitializerError: If the initialization provoked by this method fails.

Example

    import java.lang.reflect.Constructor;  
    public class NewInstanceExample1  
    {  
    String str="hello";  
    public static void main(String args[])  
    {  
    try  
    {  
    Constructor<NewInstanceExample1> obj =NewInstanceExample1.class.getConstructor();  
    NewInstanceExample1 obj1 = obj.newInstance();  
    System.out.println(obj1.str);  
    }  
    catch(Exception e)  
    {  
    e.printStackTrace();  
    }  
    }  
    }  

Output:
How many Ways to Create an Object in Java
4) Java Object.clone() method

Java clone() method creates a copy of an existing object. It is defined in Object class. It returns clone of this instance. The two most important point about clone() method is:

    The Cloneable interface must be implement while using clone() method. It is defined in java.lang package.
    The clone() method must be override with other classes.

When we use clone() method in class, the class must call super.clone() to obtain the cloned object reference.

Syntax

    protected Object clone() throws CloneNotSupportedException  

The method throws the CloneNotSupportedException if the Object class does not support the Cloneable interface. This exception also throws when subclass that overrides the clone() method indicates that instance cannot be cloned.

Example

    public class CloneExample implements Cloneable   
    {   
    //creates and returns a copy of this object  
    protected Object clone() throws CloneNotSupportedException   
    {   
    return super.clone();   
    }   
    String name = "Microprocessor";   
    public static void main(String[] args)   
    {   
    CloneExample obj1 = new CloneExample();     //creating object of class  
    try  
    {   
    CloneExample obj2 = (CloneExample) obj1.clone();   
    System.out.println(obj1.name);   
    }   
    catch (Exception e)   
    {   
    e.printStackTrace();   
    }   
    }   
    }  

Output:
How many Ways to Create an Object in Java
5) Java Object Serialization and Deserialization

A class must implement Serializable interface which belongs to java.io package. The Serializable interface does not have any method and field. They add special behavior to the class. Marker interface does not used in Java 8. It is replace by Annotations.

JVM creates a separate space whenever we serialize and deserialize an object. It does not use any constructor to create an object.
Object Serialization

The ObjectOutputStream class is used to serialize an object. The Serialization is a process of converting an object into a sequence of bytes.

The writeObject() method of ObjectOutputStream class serialize an object and write the specified object to the ObjectOutputStram class. The signature of the method is:

    public final void writeObject(Object obj) throws IOException  

The method accepts an object as a parameter.
Object Deserialization

The process of creating an object from sequence of bytes is called object deserialization. The readObject() method of ObjectInputStream class read an object from the ObjectInputStram class and deserialize it. The signature of the method is:

    public final Object readObject() throws IOException  

The method does not accept any parameter. It returns an object read from the stream. The method throws the following exceptions:

    ClassNotFoundException: If the class of serialized is not found.
    InvalidClassException: Something is wrong with a class used by serialization.
    IOException: Any of the usual Input/Output related exception.
    OptionalDataException: If primitive data was found in the stream instead of objects.

Example

In the following example we have first serialized the object and then deserialized the object.

    import java.io.*;   
    class Demo implements Serializable   
    {   
    public int i;   
    public String s;   
    public Demo(int i, String s) //default constructor  
    {   
    this.i = i;   
    this.s = s;   
    }     
    }   
    public class DeserializationExample   
    {   
    public static void main(String[] args)   
    {      
    Demo object = new Demo(8, "javatpoint");   
    String filename = "Demofile.ser";       //specified file name (must have extension .ser)  
    -----------------Serialization----------  
    try  
    {      
    FileOutputStream file = new FileOutputStream(filename);  //Saving of object in the file   
    ObjectOutputStream out = new ObjectOutputStream(file);     
    out.writeObject(object);            //serialize object  
    out.close();                    //closes the ObjectOutputStream  
    file.close();                   //closes the file  
    System.out.println("Object serialized");   
    }   
    catch(IOException e)   
    {   
    e.printStackTrace();  
    }   
    Demo obj = null;   
   // /*-----------------Deserialization--------  
    try  
    {      
    FileInputStream file = new FileInputStream(filename); // reading an object from a file   
    ObjectInputStream is = new ObjectInputStream(file);   
    obj = (Demo)is.readObject();        //deserialize object  
    is.close();                     //closes the ObjectInputStream  
    file.close();                   //closes the file  
    System.out.println("Object deserialized ");   
    System.out.println("number = " + obj.i);   
    System.out.println("string = " + obj.s);   
    }   
    catch(IOException e)   
    {   
    System.out.println("IOException is caught");   
    }   
    catch(ClassNotFoundException e)   
    {   
    System.out.println("ClassNotFoundException is caught");   
    }  
    }   
    }  

Output:
How many Ways to Create an Object in Java
Concept of cloning in Java

In OOPs, copying an object means creating a clone of an existing object. There are many ways to copy an object; two of them are- copy constructor and cloning. There are two types of cloning in Java:

    Shallow cloning
    Deep cloning

Both deep and shallow copy are types of object cloning. When we talk about an object, we consider it as a single unit which cannot be broken down further.

Suppose we have a Student object. The Student object contains other objects, as in the following figure. The Student object contains Name and Address objects. The Name contains FirstName and LastName objects, and the Address object is composed of a Street and a city object. When we talk about Student, we are talking about the entire network of objects.
How many Ways to Create an Object in Java

A clone of an object is created when we want to modify or move an object while still preserving the original object.
Shallow Cloning

    Java uses shallow cloning whenever we use the default implementation of the clone() method.
    The shallow cloning of an object creates a clone of the main object but does not copy the inner objects.
    The inner objects are shared between the original object and its copy.

For example, if we want to create a shallow copy of the Student, we should create a second object of Student. But both objects share the same Name and Address. Consider the following Example:

    public class Student  
    {  
    private Name name ;  
    private Address address;  
    public Student(Student orgStudent)  
    {  
    this.name=orgStudent.name;  
    this.address=orgStudent.address;  
    }  
    }  

A disadvantage of the shallow copy is that the two objects are not independent. When we modify the Name object of one Student, it modifies the other Students objects too.

In the following example, we have a Student object with a reference variable mba; then we make a copy of MBA, creating a second Student object, mca. If mca tries to moveOut() by modifying his Address object, the mba moves with it.

    Student mba=new Student(new Name(...), new Address(...));  
    Student mca=new Student(mba);  
    mca.moveOut(new Street(...), new City(...));  

It is because mba and mca objects shares the same Address object. If we change the Address in one object, it modifies both.
Deep Cloning

    Deep cloning is a fully independent copy of an object.
    So for the deep copy, we need to ensure all the member class also implement the Cloneable interface and override the clone() method of the Object class.

When we modify the Address object of one Student object, it does not modify the other Student object. In the following code we can see that we are not only using a copy constructor on Student object, but we are also using copy constructor on the inner objects as well.

    public class Student  
    {  
    private Name name ;  
    private Address address;  
    public Student(Student otherStudent)  
    {  
    this.name=new Name(otherStudent.name);  
    this.address=new Address(otherStudent.address);  
    }  
    }  

To create a deep clone, we need to keep copying all the Student object nested elements, until there are only primitive types and Immutable left.

    public class Street  
    {  
    private String name;        //instance variable  
    private int number;  
    public Street(Street otherStreet)  
    {  
    this.name=otherStreet.name;  
    this.number=otherStreet.number;  
    }  
    }  

The Street object has two instance variable name and number. The number is a primitive integer value, not an object. It cannot be shared. When we create a second instance variable, we are automatically creating an independent copy. In the above code String is an immutable object i.e., once created, can never be changed again. Hence, we can share it without creating a deep copy of it.
*/