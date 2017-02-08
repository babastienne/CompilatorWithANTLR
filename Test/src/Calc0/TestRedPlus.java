package Calc0;

public class TestRedPlus extends Test {
	public static void main(String[] args){
		Test.main(args);
		verbose = true;
		test(verbose, "testCalc0/redOverride.calc", "(inc x) (inc x y)", "error");
		test(verbose, "testCalc0/redParam.calc", "(inc x) (= x 0)", "error");
		test(verbose, "testCalc0/redMutRec.calc", "odd & even", "1");
		report();
	}
}
