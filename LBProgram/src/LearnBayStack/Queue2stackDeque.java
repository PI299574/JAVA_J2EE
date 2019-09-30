package LearnBayStack;

import java.util.Scanner;

public class Queue2stackDeque {

	java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();
	java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();

	public void enqueue(int data) {
		stack1.push(data);
	}

	public int dequeue() {
		int data = 0;

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if (!stack2.isEmpty())
			data = stack2.pop();
		return data;
	}

	private int print() {
		// TODO Auto-generated method stub
		int data = 0;
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			data = stack2.peek();
		} else {

			data = stack2.peek();
		}
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2stackDeque que = new Queue2stackDeque();
		/*
		 * que.enqueue(14); que.enqueue(24); que.enqueue(4); que.enqueue(10);
		 * 
		 * System.out.println(que.dequeue());
		 * 
		 * que.enqueue(20); que.enqueue(22); que.enqueue(23);
		 * System.out.println(que.dequeue());
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int ch = sc.nextInt();

			if (ch == 1) {
				int t = sc.nextInt();
				que.enqueue(t);
			} else if (ch == 2) {
				que.dequeue();
			} else if (ch == 3) {
				System.out.println(que.print());
			}

		}

	}
}
