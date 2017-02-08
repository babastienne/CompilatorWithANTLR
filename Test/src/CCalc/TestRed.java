package CCalc;

public class TestRed extends Test {
	/**
	 * Entry point. Executes all the red tests. 
	 * 
	 * @param args
	 */	
	public static void main(String[] args){	
		boolean verbose = true;
		test(verbose, "testCCalc/red1.calc", "one constant function", "2");
		test(verbose, "testCCalc/red2.calc", "one constant function, one call", "2");
		test(verbose, "testCCalc/red3.calc", "two constant functions and calls", "5");
		test(verbose, "testCCalc/red4.calc", "two constant functions and nested calls", "3");
		test(verbose, "testCCalc/red5.calc", "function and call with a parameter", "11");
		test(verbose, "testCCalc/red6.calc", "call with a composed expression", "12");
		test(verbose, "testCCalc/red10.calc", "mutually recursive functions", "1");
		test(verbose, "testCCalc/red20.calc", "local variable hide parameter", "error");
		test(verbose, "testCCalc/red21.calc", "wrong number of parameters", "error");
		test(verbose, "testCCalc/red22.calc", "function called without being defined", "error");
		test(verbose, "testCCalc/red23.calc", "function redefinition", "error");
		test(verbose, "testCCalc/red30.calc", "fibonacci classic", "1");
		report();
	}
}
