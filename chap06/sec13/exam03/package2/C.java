package chap06.sec13.exam03.package2;

import chap06.sec13.exam03.package1.A;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 10; //0
		//a.field2 = 10; //X <= default 필드는 접근 불가능
		//a.field3 = 10; //X <= private 필드로 선언되어 접근 불가능(컴파일 에러)
		
		//메소드 호출
		a.method1(); //0
		//a.method2(); //X <= default 메소드는 다른 패키지에서는 접근 불가능
		//a.method3(); //X <= private 메소드 접근 불가능(컴파일 에러)
	}

}
