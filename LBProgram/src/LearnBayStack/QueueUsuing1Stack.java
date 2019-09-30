package LearnBayStack;

public class QueueUsuing1Stack {

	
	java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();
	java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();
	

	public void enque(int data) {

		if (stack1.isEmpty()) {
			stack1.push(data);
		} else {
			while (!stack1.isEmpty()) { // make it empty and then push data
				stack2.push(stack1.pop());
			}
			stack1.push(data);
		}

		while (!stack2.isEmpty()) { // now make helper stack empty
			stack1.push(stack2.pop());
		}

	}

	public int deque() {

		return stack1.pop();

	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
