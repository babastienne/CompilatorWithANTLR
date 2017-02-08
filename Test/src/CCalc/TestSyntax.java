package CCalc;

public class TestSyntax {
	static int count = 0;
	static int success = 0;
	
	public static void report(){
		System.out.println(success + " successful tests out of " + count);
	}

	public static void test(String filename, boolean wellFormed){
		String[] args0 = new String[1];
		args0[0] = filename;
		System.out.println("====: " + filename);
		try {		
			count++;
//			CCalc.main(args0);
			if (wellFormed) success++;
			else System.err.println("FAILURE" + filename);
		} catch(Exception e){
			if (!wellFormed) success++;
			else System.err.println("FAILURE" + filename);
			e.printStackTrace();
		}		
	}
	public static void main(String[] args){
		test("testCCalc/green1.calc", true);
		test("testCCalc/green2.calc", true);
		test("testCCalc/green3.calc", true);
		test("testCCalc/green4.calc", true);
		test("testCCalc/green5.calc", true);
		test("testCCalc/green6.calc", true);
		test("testCCalc/green7.calc", true);
		test("testCCalc/green8.calc", true);
		test("testCCalc/green9.calc", true);
		test("testCCalc/green10.calc", true);
		test("testCCalc/green11.calc", true);
		test("testCCalc/green12.calc", true);
		test("testCCalc/green13.calc", true);
		test("testCCalc/green14.calc", true);
		test("testCCalc/green15.calc", true);
		test("testCCalc/green16.calc", true);
		test("testCCalc/green17.calc", true);
		test("testCCalc/green18.calc", true);
		test("testCCalc/green19.calc", true);
		test("testCCalc/green21.calc", false);
		test("testCCalc/green22.calc", false);
		test("testCCalc/green23.calc", false);
		test("testCCalc/green24.calc", false);
		test("testCCalc/green25.calc", true);
		test("testCCalc/green26.calc", true);
		test("testCCalc/green27.calc", false);
		
		test("testCCalc/blue1.calc", true);
		test("testCCalc/blue2.calc", true);
		test("testCCalc/blue3.calc", true);
		test("testCCalc/blue4.calc", true);
		test("testCCalc/blue5.calc", true);
		test("testCCalc/blue6.calc", true);
		test("testCCalc/blue7.calc", true);
		test("testCCalc/blue8.calc", false);
		
		test("testCCalc/red1.calc", true);
		test("testCCalc/red2.calc", true);
		test("testCCalc/red3.calc", true);
		test("testCCalc/red4.calc", true);
		test("testCCalc/red5.calc", true);
		test("testCCalc/red6.calc", true);
		test("testCCalc/red10.calc", true);
		report();
	}
}

