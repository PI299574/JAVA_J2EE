
package Exception;

import java.util.Scanner;

class MyException extends Exception{
	
	public MyException(String  S){
		super(S);
	}

}


public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age<18){
				throw new MyException("age is not valid"); 
		}
		else{
			System.out.println("age is valid");
		}
		}
		catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            System.out.println("Exception is  "+e.getMessage());
			//e.getMessage();
		}
	}

}
