package chap06.sec13.exam01.package2;

import chap06.sec13.exam01.package1.B;

public class C {
	//필드 선언
	//A a; // x <== A클래스는 default로 선언되어 있어서 다른 패키지에서는 사용 불가함
	B b; // O <== public 선언자는 다른 패키지에서도 사용 가능함

}
