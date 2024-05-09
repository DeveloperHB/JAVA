package chap16.sec05.exam01;

public class Computer {
	public static double staticMethod(double x, double y) {
		return x + y; //정적 메소드
	}
	
	public double instanceMethod(double x, double y) {
		return x * y;//인스턴스 메소드
	}

}
