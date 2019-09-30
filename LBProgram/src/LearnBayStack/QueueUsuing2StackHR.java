package LearnBayStack;

import java.math.BigInteger;
import java.util.Scanner;

//if stack 1 is  empty: push data(make always stack1 empty while pushing 

//else make st1 empty push data to stack 2
//if stack 2 is not empty make stack2 empty push to stack1 again.

public class QueueUsuing2StackHR {

	java.util.Stack<BigInteger> stack1 = new java.util.Stack<BigInteger>();
	java.util.Stack<BigInteger> stack2 = new java.util.Stack<BigInteger>();
	QueueUsuing2StackHR(){
		stack1 = new java.util.Stack<BigInteger>();
	   stack2 = new java.util.Stack<BigInteger>();
	}
	public void enque(BigInteger data) {

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

	public BigInteger deque() {

		return stack1.pop();

	}

	public BigInteger print() {

		return stack1.peek();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsuing2StackHR que = new QueueUsuing2StackHR();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int ch = sc.nextInt();
			
			if(ch==1){
				que.enque(sc.nextBigInteger());
			}
			else if(ch==2){
				que.deque();
			}
			else if(ch==3){
				System.out.println(que.print());
			}
			/*switch (ch) {
			case 1:
				que.enque(sc.nextInt());
				break;
			case 2:
				que.deque();

				break;
			case 3:
				System.out.println(que.print());
				break;
			default:
				break;
			}*/
		}

	}

}
