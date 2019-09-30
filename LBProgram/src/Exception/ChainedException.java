package Exception;

import java.io.IOException;

/*In an application, one exception throws many exceptions. i.e one exception causes another exception
and that exception causes another exception thus forming chain of exceptions. 
It is better to know where the actual cause of the exception lies. 
This is possible with chained exceptions feature of the Java.

Chained exceptions are introduced from JDK 1.4. To implement chained exceptions in java, 
two new constructors and two new methods are added in the Throwable class. They are:
	
	1) Throwable(Throwable cause)    —-> where cause is the exception that causes the current exception.

	2) Throwable(String msg, Throwable cause)   —-> where msg is the exception message and
	cause is the exception that causes the current exception.
	
	Methods Of Throwable class Which support chained exceptions in java :
	1) getCause() method : This method returns actual cause of an exception.
	2) initCause(Throwable cause) method : This method sets the cause for the calling exception.
*/


public class ChainedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{divide(5,0);
		//int a=5/0;
		}catch(ArithmeticException e){
			//displaying the exception
			System.out.println("cause is "+e);
			//getting the actual cause of the exception
			System.out.println("Actual cause "+e.getCause());
			
		}
	}

	private static void divide(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0){
			 //creating an exception
			ArithmeticException ae=new ArithmeticException("Arthematic Exception");
			 //setting a cause of the exception
			ae.initCause(new IOException("init cause"));
			throw ae;
		}else{
			System.out.println(a/b);;
		}
		
	}

}
