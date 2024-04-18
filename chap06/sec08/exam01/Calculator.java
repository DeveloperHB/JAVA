package chap06.sec08.exam01;

public class Calculator { //라이브러리 클래스
	//리턴값이 없는 메소드 선언
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	
	
	void powerOff( ) {
		System.out.println("전원을 끕니다.");
	}
	
	//호출한 곳으로 결과값을 int로 리턴하는 메소드를 선언함
	int plus(int x, int y){
		System.out.println("plus 메소드 실행!!!");
		int result = x+y;
		return result;
	}
	//호출한 곳으로 결과값을 double형으로 리턴하는 메소드를 선언함
	double divide(int x, int y) {
		System.out.println("divide 메소드 실행!!!");
		double result = (double)x / y;
		return result;
	}

}
