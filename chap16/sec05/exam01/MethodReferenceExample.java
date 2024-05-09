package chap16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//정적 메소드일 경우 클래스 이름 뒤에 :: 기호를 붙이고 정적 메소드 이름을 기술(클래스 이름 ::정적메소드이름)
		//람다식
		//person.action((x, y)-> Computer.staticMethod(x, y));
		//메소드 참조
		person.action(Computer :: staticMethod );
		
		//인스턴스 메소드일 경우 객체를 생성한 다음 참조 변수 뒤에 ::기호를 붙이고 인스턴스 메소드 이름을 기술
		//(참조변수::인스턴스 메소드이름)
		Computer com = new Computer();
		//람다식
		//person.action(x, y) -> com.instatnceMethod(x, y));
		//메소드 참조
		person.action(com :: instanceMethod);

	}

}
