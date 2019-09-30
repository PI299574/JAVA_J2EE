package LearnBay;

public class LongestParenthesisLength {

	
	private static int findLongestParenthesisLength(String parenthesis) {
		// TODO Auto-generated method stub
	
		Stack stack=new Stack();
		stack.push(-1);
		int result=0;
		for(int i=0;i<parenthesis.length();i++){
			if(parenthesis.charAt(i)=='('){
				stack.push(i);
			}
			else{
				stack.pop();
				if(!stack.isEmpty()){
					result=max(result, i-stack.peek());
					System.out.println("Result"+result);
				}
			}
		}
		return result;
		
	}
	
	private static int max(int result, int i) {
		// TODO Auto-generated method stub
		if (i>result)
			return i;
		else 
			return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String parenthesis="((()))((((((()))))";
		String parenthesis="((()))((((";
		//String parenthesis="((()))";
		int length=findLongestParenthesisLength(parenthesis);
		System.out.println(length);
	}

	

}
