package parser.ast;

public enum Op {
	PLUS,
	MINUS,
	TIMES,
	DIVIDE,
	COMPARE,
	LESS;

	static public Op parseOP(String op) {
		switch (op) {
			case "+": return PLUS;
			case "-": return MINUS;
			case "*": return TIMES;
			case "/": return DIVIDE;
			case "==": return COMPARE;
			case "<": return LESS;
            default: return null;
		}
	}
}
