package Calc0;

public class TestErrors extends Test {
	
	public static void main(String[] args){
		Test.main(args);
		verbose = true;
	// various errors
		test(verbose, "testCalc0/error.calc", "no file", "error");
		test(verbose, "testCalc0/errorEmpty.calc", "", "error");
		test(verbose, "testCalc0/errorGarbage.calc", "FOO!", "error");
		test(verbose, "testCalc0/errorGarbage2.calc", "00", "error");
		test(verbose, "testCalc0/errorUnaryExp.calc", "(+ 2)", "error");
		test(verbose, "testCalc0/errorParens.calc", "(2)", "error");
		test(verbose, "testCalc0/errorRPar.calc", "(+ 1 2", "error");
		test(verbose, "testCalc0/errorIf.calc", "(if1 1 0)", "error");
		test(verbose, "testCalc0/errorIf2.calc", "(if 1 1)", "error");
		test(verbose, "testCalc0/errorDivide.calc", "(/ 1 0)", "error");
		report();
	}
}
