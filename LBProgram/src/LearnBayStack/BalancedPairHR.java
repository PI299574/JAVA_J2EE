package LearnBayStack;

import java.util.Scanner;

class Stack1<T extends Object> {

	T[] stack;
	int top;
	int size;

	@SuppressWarnings("unchecked")
	public Stack1(int n) {
		top = -1;
		size = n;
		stack = (T[]) new Object[size];

	}

	public void push(T data) {
		if (IsFull()) {
			System.out.println("stack is full : Memoery Overflow");
		}
		top++;
		stack[top] = data;
	}

	public T pop() {
		if (IsEmpty()) {
			return null;
			// System.out.println("stack is Empty : Memoery underflow");

		}
		T data = null;
		data = stack[top];
		top--;
		return data;
	}

	public T peek() {
		if (IsEmpty()) {

			System.out.println("stack is Empty : Memoery underflow");
		}
		T data = null;
		data = stack[top];
		return data;
	}

	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

	public boolean IsFull() {
		// TODO Auto-generated method stub
		return (top == size - 1);
	}
}

public class BalancedPairHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (checkParenthesis(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		// String
		// s="[]][{]{(({{)[})(}[[))}{}){[{]}{})()[{}]{{]]]){{}){({(}](({[{[{)]{)}}}({[)}}([{{]]({{";
		// String s="[]]";
		// System.out.println(checkParenthesis(s));
		//
	}

	static boolean checkParenthesis(String s) {
		// TODO Auto-generated method stub
		Stack1<Character> stack = new Stack1<Character>(10000);
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {

				if (!stack.IsEmpty()) {
					try {
						if (s.charAt(i) == ']') {
							Character prevIndex = stack.pop();
							if (prevIndex != '[' || prevIndex == null) {
								return false;
							}
						} else if (s.charAt(i) == '}') {
							Character prevIndex = stack.pop();
							if (prevIndex != '{' || prevIndex == null) {
								return false;
							}
						} else if (s.charAt(i) == ')') {
							Character prevIndex = stack.pop();
							if (prevIndex != '(' || prevIndex == null) {
								return false;
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
				} else {
					return false;
				}
			}

		}
		if (stack.top != -1) {
			return false;
		}

		// System.out.println(flag);
		return flag;
	}

}
