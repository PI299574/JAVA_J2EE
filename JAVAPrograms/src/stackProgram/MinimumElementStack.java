package stackProgram;

public class MinimumElementStack {

	java.util.Stack<Integer> stack=new java.util.Stack<Integer>();
	java.util.Stack<Integer> minstack=new java.util.Stack<Integer>();
	
	public void push(Integer data){
		if(stack.isEmpty()){
			stack.push(data);
			minstack.push(data);
		}else{
			stack.push(data);
			if(minstack.peek()>data){
				minstack.push(data);
			}
		}
	}
	public Integer pop(){
		Integer data=stack.pop();
		if(data==minstack.peek()){
			minstack.pop();
		}
		return data;
	}
	
	public Integer min(){
		return minstack.peek();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumElementStack minstack=new MinimumElementStack();
		minstack.push(13);
		minstack.push(25);
		minstack.push(10);
		minstack.push(8);
		System.out.println(minstack.min());
		minstack.pop();
		System.out.println(minstack.min());
		minstack.push(13);
		minstack.pop();
		
	 System.out.println(minstack.min());
	}

}
