package chap04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
		switch(grade) {
		case 'A','a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B','b' -> {
		    System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}
		System.out.println("switch1 문 다음 문장 실행중");
		switch(grade) {
		case 'A','a' -> System.out.println("우수 회원입니다.");
		
		case 'B','b' -> System.out.println("일반 회원입니다.");
		
		default ->  System.out.println("손님입니다.");
		}
		System.out.println("switch2 문 다음 문장 실행중!!!");
	}
}
		

	


