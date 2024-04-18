package chap06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi; //클래스 이름과 함께 . 연산자로 접근해서 사용함
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}

}
