package chap04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'C';
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		System.out.println("switch 문 다음 문장 실행중!!!");
	}

}