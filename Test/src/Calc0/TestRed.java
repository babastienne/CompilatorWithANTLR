package Calc0;

public class TestRed extends Test {
	public static void main(String[] args){
		Test.main(args);
		verbose = true;
		test(verbose, "testCalc0/redFib0.calc", "(define (fib n)... (fib 4)", "3");
		test(verbose, "testCalc0/redFib.calc", "(define (fib n)... (fib 4)", "3");
    	test(verbose, "testCalc0/redFib2.calc", "(define (fib n)... (fib 4))", "3");
		test(verbose, "testCalc0/redFib3.calc", "(define (fib n)... (fib 4))", "3");
		test(verbose, "testCalc0/redFuncRedef.calc", "(define (f x)(= x 1) x)(f x)", "error");
		report();
	}
}


