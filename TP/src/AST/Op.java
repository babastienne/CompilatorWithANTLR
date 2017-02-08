package AST;

public enum Op {
	PLUS,
	MINUS,
	TIMES,
	DIVIDE,
	COMPARE,
	LESS,
	LESSOREQUAL,
	MORE,
	MOREOREQUAL,
	EX,
    AND,
    OR,
	DIFFERENT;

	static public Op parseOP(String op) {
		switch (op) {
			case "+": return PLUS;
			case "-": return MINUS;
			case "*": return TIMES;
			case "/": return DIVIDE;
			case "==": return COMPARE;
			case "!=": return DIFFERENT;
			case "<": return LESS;
			case "<=": return LESSOREQUAL;
			case ">": return MORE;
			case ">=": return MOREOREQUAL;
			case "!": return EX;
            case "&&": return AND;
            case "||": return OR;
            default: return null;
		}
	}
}
