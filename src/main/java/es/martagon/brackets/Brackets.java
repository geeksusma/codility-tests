package es.martagon.brackets;

import java.util.Stack;

class Brackets {

	private static final char OPEN_SQUARE = '[';
	private static final char OPEN_PAR = '(';
	private static final char OPEN_KEY = '{';

	private static final char CLOSE_SQUARE = ']';
	private static final char CLOSE_PAR = ')';
	private static final char CLOSE_KEY = '}';

	public int solution(String S) {
		Stack<Character> stack = new Stack<>();

		for (char item : S.toCharArray()) {
			if (isOpen(item)) {
				stack.push(item);
			} else {
				if (isClose(item)) {
					if (stack.isEmpty() || item != getCloseBracket(stack.pop())) {
						return 0;
					}
				}
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}

	private boolean isOpen(char item) {
		return (item == OPEN_SQUARE || item == OPEN_PAR || item == OPEN_KEY);
	}

	private boolean isClose(char item) {
		return (item == CLOSE_SQUARE || item == CLOSE_PAR || item == CLOSE_KEY);
	}

	private char getCloseBracket(char item) {
		if (item == OPEN_KEY)
			return CLOSE_KEY;
		if (item == OPEN_PAR)
			return CLOSE_PAR;
		return CLOSE_SQUARE;
	}
}
