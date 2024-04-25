package chap12.sec12;

public class Service {
	@PrintAnnotation //PrintAnnotation적용
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*") //PrintAnnotation적용
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20) //PrintAnnotation적용
	public void method3() {
		System.out.println("실행 내용3");
	}

}
