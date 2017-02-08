package Calc0;

public class TestPersistentState extends Test {
	public static void main(String[] args){
		Test.main(args);
		verbose = true;
		test(verbose, "testCalc0/a.calc", "(= a 1) a", "1");
		test(verbose, "testCalc0/noa.calc", "a", "error");
 
		report();
	}
}
