package chap04.sec06;

public class WhileExample {

	public static void main(String[] args) {
		    //Exam:주사위 2개를 굴려 두 눈의 합이 5가 되면 종료
		    //while문 이용, Math.random()메소드 이용
		    //주사위 두 눈의 합이 5이면 실행을 멈춤
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + "," + num2 +")");
			if((num1+num2) ==5) {
				break;
			}
			
		}
		System.out.println("두눈의 합계가 5가 되어 while문을 종료합니다");

	}

}
