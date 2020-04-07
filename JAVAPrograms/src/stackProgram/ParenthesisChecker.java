package stackProgram;

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String exp = "[()]{}{[()()]()}";

		String exp = "[{()()}({[]})]({}[({})])((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]]";

		boolean checker = parenthesisChecker(exp);
		System.out.println(checker);
	}

	private static boolean parenthesisChecker(String exp) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Stack<Character> stack = new java.util.Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {

			if (exp.charAt(i) == '{' || exp.charAt(i) == '['
					|| exp.charAt(i) == '(') {
				stack.push(exp.charAt(i));

			} else {
				if (!stack.isEmpty()) {

					if (exp.charAt(i) == ']') {
						Character prevIndex = stack.pop();
						if (prevIndex != '[' || prevIndex == null) {
							return false;
						}
					}
					if (exp.charAt(i) == '}') {
						Character prevIndex = stack.pop();
						if (prevIndex != '{' || prevIndex == null) {
							return false;
						}
					}
					if (exp.charAt(i) == ')') {
						Character prevIndex = stack.pop();
						if (prevIndex != '(' || prevIndex == null) {
							return false;
						}
					}
				}
			}
		}

		if (!stack.isEmpty()) {
			return false;
		}
		return flag;

	}
}