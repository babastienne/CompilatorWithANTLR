package Calc0;

public class TestTab extends Test {
	
	public static void main(String[] args){
		Test.main(args);
		// Calc Green	
		verbose = true;
		test(verbose, "testCalc0/greenZeroTab.calc", "0", "0");
 
		report();
	}
}
