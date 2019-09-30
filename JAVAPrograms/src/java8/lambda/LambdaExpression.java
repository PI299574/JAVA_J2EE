package java8.lambda;

public class LambdaExpression {


	public void greeting(){
		System.out.println("Hello World!!");
	}
	public static void main(String args[]){
		greet greeting1 = ()->System.out.println("Hello World!!");

		doubles doubleNoFunction = (int a)-> a*2 ;

		add addFunction = (int a,int b)-> a+b;
		divide safeDivide= (int a, int b)->{
			if(a==0) {
				return 0;
			}
			return a/b;
		};

		/*stringLength =(String s)->{
			return s.length();
		};*/

	}

	interface greet{
		public void foo();
	}

	interface add{
		public int add1(int a,int b);
	}
	interface divide{
		public float divide1(int a,int b);
	}
	interface doubles{
		public int doule(int a);
	}
}