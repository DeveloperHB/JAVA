package chap06.sec13.exam03.package1; //A 클래스와 패키지가 동일함

public class B { 
	public void method( ) {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1; //0
		a.field2 = 2; //0
		// a.field3 = 1; //X <== private 필드 설정으로 인해 같은 클래스 안에서만 사용가능
		
		//메소드 호출
		a.method1(); //0
		a.method2(); //0
		//a.method3(); //X <== private 메소드 접근 불가함(컴파일 에러)
		
	}

}
