package p0526;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		byte v1 = 15;
		byte v2 = 5;
		int v3 = 100;
		long v4 = 20L;
		
		int result1 = v1 + v2;
		System.out.println("result1:" + result1);
		
		long result2 = v1 + v2 - v4;
		System.out.println("result2:" + result2);
		
		double result3 = (double) v1 / v2;
		System.out.println("result3:" + result3);
		
		int result4 = v1 % v2;
		System.out.println("result4:" + result4);
	}

}
