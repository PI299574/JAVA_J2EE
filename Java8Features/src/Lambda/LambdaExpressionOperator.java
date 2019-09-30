package Lambda;

interface FuncionalIntefce1{
	public int opertion(int a,int b);
}



interface FuncionalIntefce2{
	public void SayHello(String message);
}
public class LambdaExpressionOperator {

	public int operate(int a,int b, FuncionalIntefce1 fc1){
		return fc1.opertion(a,b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FuncionalIntefce1 add=(a,b)->{
			return a+b;
		};
		FuncionalIntefce1 multiply=(a,b)->{
			return a*b;
		};
		
		LambdaExpressionOperator test=new  LambdaExpressionOperator();
		int add1=test.operate(10, 20, add);
		System.out.println("Add "+add1);
		
		int multiply1=test.operate(10, 20, add);
		System.out.println("Multiply "+multiply1);
		
		FuncionalIntefce2 fc2=(message)->{
			System.out.println("pintu Kumar "+message);
		};
		
		fc2.SayHello("Hello World!!");
	}

}
/*Important points:

1. The body of a lambda expression can contain zero, one or more statements.

2 .When there is a single statement curly brackets are not mandatory and the return type of
the anonymous function is the same as that of the body expression.

3. When there are more than one statements, then these must be enclosed in curly brackets (a code block)
and the return type of the anonymous function is the same as the type of the value
returned within the code block, or void if nothing is returned.*/