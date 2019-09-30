package LearnBayStack;

//if stack 1 is  empty: push data(make always stack1 empty while pushing 

//else make st1 empty push data to stack 2
//if stack 2 is not empty make stack2 empty push to stack1 again.

public class QueueUsuing2Stack {

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

		QueueUsuing2Stack que = new QueueUsuing2Stack();
		que.enque(14);
		que.enque(24);
		que.enque(4);
		que.enque(10);

		System.out.println(que.deque());
		//System.out.println(que.deque());
		//System.out.println(que.deque());

		que.enque(20);
		que.enque(22);
		que.enque(23);
		System.out.println(que.deque());
	}

}
