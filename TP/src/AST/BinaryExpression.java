package AST;

import error.GenerationError;
import error.ProgramError;

import java.util.List;

public class BinaryExpression extends Expression{
	private Expression expr1, expr2;
	private Op op;
	
	public BinaryExpression(Op op, Expression expr1, Expression expr2) {
		this.op = op;
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	public String toString() {
		return "BinaryExpression(" + op.toString() + ", " + this.expr1 + ", " + this.expr2;
	}

	public String gen(List<Definition> definitions) {
		if(this.getType(definitions) == Type.BOOLEAN)
			return genBoolean(definitions);
		else
			return genLitteral(definitions);
	}

	@Override
	public String gen() {
		return null;
	}

	@Override
	public Type getType(List<Definition> definitions) {
		if(this.expr1.getType(definitions) != this.expr2.getType(definitions))
			throw new ProgramError("Opération binaire non possible sur des opérandes de types différents : " + this.expr1.gen() + "/" + this.expr2.gen());
		else {
			switch(op) {
				case COMPARE:
					return Type.BOOLEAN;
				case DIFFERENT:
					return Type.BOOLEAN;
				case LESS:
					return Type.BOOLEAN;
				case LESSOREQUAL:
					return Type.BOOLEAN;
				case MORE:
					return Type.BOOLEAN;
				case MOREOREQUAL:
					return Type.BOOLEAN;
				default:
					return this.expr1.getType(definitions);
			}
		}
	}

	private String genLitteral(List<Definition> definitions) {
		String operator;
		switch(op) {
			case PLUS:
				operator = "+";
				break;
			case DIVIDE:
				operator = "/";
				break;
			case MINUS:
				operator = "-";
				break;
			case TIMES:
				operator = "*";
				break;
			case COMPARE:
				operator = "==";
				break;
			case DIFFERENT:
				operator = "!=";
				break;
			case LESS:
				operator = "<";
				break;
			case LESSOREQUAL:
				operator = "<=";
				break;
			case MORE:
				operator = ">";
				break;
			case MOREOREQUAL:
				operator = ">=";
				break;
			default:
				throw new GenerationError("Opérateur non reconnu ou non d=adapté au type des opérandes (entiers)");
		}

		return this.expr1.gen(definitions) + " " + operator + " " + this.expr2.gen(definitions);
	}

	private String genBoolean(List<Definition> definitions) {

		String operator;
		switch(op) {
			case COMPARE:
				operator = "==";
				break;
			case DIFFERENT:
				operator = "!=";
				break;
			case LESS:
				operator = "<";
				break;
			case LESSOREQUAL:
				operator = "<=";
				break;
			case MORE:
				operator = ">";
				break;
			case MOREOREQUAL:
				operator = ">=";
				break;
			case AND:
				operator = "&&";
				break;
			case OR:
				operator = "||";
				break;
			default:
				throw new GenerationError("Operateur non reconnu ou non adapté au type des opérandes (booléen)");
		}

		return this.expr1.gen(definitions) + " " + operator + " " + this.expr2.gen(definitions);
	}
}
