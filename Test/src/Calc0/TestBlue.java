package Calc0;

public class TestBlue extends Test {
	public static void main(String[] args){
		Test.main(args);
		verbose = true;
		test(verbose, "testCalc0/blueDef.calc", "(= a 11) a", "11");
		test(verbose, "testCalc0/blueDef2.calc", "(= a 1) (= b 2) (+ a b)", "3");
        test(verbose, "testCalc0/blueDef3.calc", "(= a 1) (= b (- a 1)) (+ a b)", "1");
		test(verbose, "testCalc0/blueRedef.calc", "(= a 11) (= a 12)", "error");
        test(verbose, "testCalc0/blueUndef.calc", "a", "error");
		report();
	}
}
