package CCalc;

public class TestBlue extends Test {
	/**
	 * Entry point. Executes all the tests. 
	 * 
	 * @param args
	 */
	public static void main(String[] args){	
		boolean verbose = true;
		test(verbose, "blue1.calc", "one variable def", "102");
		test(verbose, "blue2.calc", "one variable def and use", "101");
		test(verbose, "blue3.calc", "two variable defs used in expression", "103");
		test(verbose, "blue4.calc", "two variable defs with nested uses", "104");
		test(verbose, "blue5.calc", "variable use without a def", "error");
		test(verbose, "blue6.calc", "variable used before its def", "error");
		test(verbose, "blue7.calc", "redefinition of a variable", "error");
		test(verbose, "blue8.calc", "erroneous variable nameblue", "error");
		report();
	}
}
