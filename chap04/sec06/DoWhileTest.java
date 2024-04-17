package chap04.sec06;

public class DoWhileTest {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		do {
			b += a;
			System.out.println("b =" + b);
			System.out.println("a =" + a);
		} while(a>b);
		
		System.out.println("do while 문 다음 문장입니다. !!!");

	}

}
