package chap04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";
		// JAVA 11 이전 문법
		int score1 = 0;
		switch(grade) {
		case "A" : 
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
			default:
				score1 = 60;
				
		}
		System.out.println("score1: " + score1);
		//JAVA 12부터 가능
		int score2 = switch(grade) {
		               case "A" -> 100;
		               case "B" -> {
		                  int result = 100-20;
		                  // JAVA 13 부터 가능
		                  yield result;
		                  //yield는 해당 switch 블록에 특정 값을 switch의 결과값으로 반환함
		                }
		                default -> 60;

	};//한문장이라 세미클론 확인 必
	System.out.println("score2: " + score2);
	}
}
