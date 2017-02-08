package Calc0;

public class TestNonRecRed extends Test {
	public static void main(String[] args){
		Test.main(args);
		verbose = true;
		test(verbose, "testCalc0/redFunc0.calc", "(define (zero) 0)(zero)", "0");
		test(verbose, "testCalc0/redId.calc", "(define (id x) x) (id 11)", "11");
		test(verbose, "testCalc0/redFuncs.calc", "(define (id x) x)(define (id2 x) x) 22", "22");
		test(verbose, "testCalc0/redFunc1.calc", "(define (inc x) (+ x 1))(inc 0)", "1");
		test(verbose, "testCalc0/redFunc2.calc", "(define (id x) x)(id (+ 0 1))", "1");
		test(verbose, "testCalc0/redFunc3.calc", "(define (id x) x)(= a 3)a", "3");
		test(verbose, "testCalc0/redFunc4.calc", "(define (inc x) (+ x 1))(inc (+ 3 1))", "5");
		test(verbose, "testCalc0/redFunc5.calc", "(define (inc x) (+ x 1))(= a 2)(inc (+ 1 a))", "4");
		test(verbose, "testCalc0/redFuncRedef.calc", "(define (f x)(= x 1) x)(f x)", "error");
		report();
	}
}



