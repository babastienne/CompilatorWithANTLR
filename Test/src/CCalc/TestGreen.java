package CCalc;

public class TestGreen extends Test {
	/**
	 * Entry point. Executes all the tests. 
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		boolean verbose = true;
		test(verbose, "green1.calc", "number", "1234567890");
		test(verbose, "green2.calc", "addition", "2");
		test(verbose, "green3.calc", "arithmetic expression with priority", "7");
		test(verbose, "green4.calc", "unary minus", "-4");
		test(verbose, "green5.calc", "boolean", "0");
		test(verbose, "green6.calc", "boolean expression", "1");
		test(verbose, "green7.calc", "boolean expression with priority", "1");
		test(verbose, "green8.calc", "boolean expression with explicit priority", "0");
		test(verbose, "green9.calc", "unary not", "1");
		test(verbose, "green10.calc", "conditional", "12");
		test(verbose, "green11.calc", "conditional", "21");
		test(verbose, "green12.calc", "comparison", "1");
		test(verbose, "green13.calc", "nested conditionals", "2");
		test(verbose, "green14.calc", "unequality", "1");
		test(verbose, "green15.calc", "equality", "0");
		test(verbose, "green16.calc", "equality", "error");
		test(verbose, "green17.calc", "nested divisisons", "1");
		test(verbose, "green18.calc", "minus mix", "2");
		test(verbose, "green19.calc", "parenthesized number", "2");
		test(verbose, "green20.calc", "erroneous expression", "error");
		test(verbose, "green21.calc", "garbage", "error");
		test(verbose, "green22.calc", "garbage", "error");
		test(verbose, "green23.calc", "erroneous conditional", "error");
		test(verbose, "green24.calc", "erroneous conditional/garbage", "error");
		test(verbose, "green25.calc", "division by zero", "error");
		test(verbose, "green26.calc", "division by zero", "error");
		test(verbose, "green27.calc", "erroneous number", "error");
		report();
	}
}
