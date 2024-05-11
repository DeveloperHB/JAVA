package practice.chap04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 77;
		
		if(score>=90) {
			System.out.println("점수가 90점 이상입니다");
			System.out.println("등급은 A이상입니다");
		} else {
			System.out.println("점수가 90점 이하입니다");
			System.out.println("등급은 B이하입니다");
		}
	}

}
