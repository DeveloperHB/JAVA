package practice.chap04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 87;
		
		if(score>85) {
			System.out.println("점수가 85보다 큽니다");
			System.out.println("등급은 B+이상입니다");
		}
		
		if(score <= 90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 A-미만 입니다");
		}

	}

}
