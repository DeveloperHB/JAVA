package chap16.sec01;

@FunctionalInterface // 추상 메소드가 하나인지 검사함
//인터페이스가 함수형 인터페이스임을 보장하기 위해
//@FunctionalInterface 붙임
public interface Calculable {
	//추상 메소드
	void calculate(int x, int y);

}
