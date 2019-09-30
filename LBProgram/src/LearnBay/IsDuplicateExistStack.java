package LearnBay;

public class IsDuplicateExistStack {

	private static  boolean isDuplicate(String parenthesis) {
		// TODO Auto-generated method stub
		
		Stackchar stack=new Stackchar();
		
		for(int i=0;i<parenthesis.length();i++){
			
			
			if(parenthesis.charAt(i)==')')
			{
				//System.out.println(stack.pop());
				int temp=stack.pop();
				int top=stack.top;
				if(temp=='('){
					return true;
				}
				else{
					while(top!='('){
						top=stack.top;
						stack.pop();
					}
				}
				
				
			}

			else{
				stack.push(parenthesis.charAt(i));
			}
			//System.out.println(stack.pop());
			
		}
		
		
		
		
		return false;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String parenthesis="(((a+b(b)))+(c+d))";
		
		boolean b=isDuplicate(parenthesis);
		System.out.println(b);
	}

	

}
