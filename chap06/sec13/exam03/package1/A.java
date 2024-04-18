package chap06.sec13.exam03.package1;

public class A {
	//public 접근 제한을 갖는 필드 선언
	public int field1;
	int field2; //default 접근 제한을 갖는 필드 선언
	private int field3; //private 접근 제한을 갖는 필드 선언
	
	//생성자 선언
	public A() {
		field1 = 1; //0
		field2 = 1; //0
		field3 = 1; //0
		
		method1(); //public
		method2(); //default
		method3(); //
		
	}
	
	public void method1() { //public 메소드로 선언
		
	}
	void method2() { //default 메소드로 선언
		
	}
	private void method3() {//private 메소드로 선언
		
	}

}
