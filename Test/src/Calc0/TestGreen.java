package Calc0;

public class TestGreen extends Test {
	
	public static void main(String[] args){
		Test.main(args);
		// Calc Green
		verbose = true;
		test(verbose, "testCalc0/greenZeroUnix.calc", "0", "0");
		test(verbose, "testCalc0/greenZeroDos.calc", "0", "0");
		test(verbose, "testCalc0/greenZeroTab.calc", "0", "0");
		test(verbose, "testCalc0/greenOne.calc", "1", "1");
		test(verbose, "testCalc0/greenLit.calc", "123", "123");
		test(verbose, "testCalc0/greenUnExpMinus.calc", "-1", "-1");
		test(verbose, "testCalc0/greenBinExpPlus.calc", "(+ 1 1)", "2");
		test(verbose, "testCalc0/greenBinExpPlus01.calc", "(+ 01)", "1");
		test(verbose, "testCalc0/greenBinExpMinus.calc", "(- 1 1)", "0");
		test(verbose, "testCalc0/greenBinExpDivide.calc", "(/ 5 2)", "2");
		test(verbose, "testCalc0/greenBinExpEqual.calc", "(== 1 2)", "0");
		test(verbose, "testCalc0/greenBinExpEqual2.calc", "(== 3 3)", "1");
		test(verbose, "testCalc0/greenNestedExp.calc", "(+ (- 2 3) (+ 0 1))", "0");
		test(verbose, "testCalc0/greenIf0.calc", "(if 0 1 0)", "0");
		test(verbose, "testCalc0/greenIf0Indent.calc", "(if 0 1 0)", "0");
		test(verbose, "testCalc0/greenIf1.calc", "(if 1 1 0)", "1");
		test(verbose, "testCalc0/greenIf2.calc", "(if 2 1 0)", "1");
		test(verbose, "testCalc0/greenNestedIfInTest.calc", "(if (if 1 1 0) 2 3)", "2");
		test(verbose, "testCalc0/greenNestedIfInBranch.calc", "(if 1 (if 1 2 0) 3)", "2");
		test(verbose, "testCalc0/greenNestedIfInExp.calc", "(+ (if 1 1 0) 1)", "2");
		test(verbose, "testCalc0/greenNestedExpAsTest.calc", "(if (- 1 1) 1 44)", "44");
 
		report();
	}
}
