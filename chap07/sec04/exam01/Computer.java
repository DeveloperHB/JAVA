package chap07.sec04.exam01;

public class Computer extends Calculator {
	@Override
	public double areaCircle(double r) {
		//메소드 오버라이딩
		//상속된 메소드를 자식 클래스에서 재정의하는 것
		//부모 메소드는 숨겨지고, 자식 메소드가 우선적으로 실행됨
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI *r* r;
	}

}
