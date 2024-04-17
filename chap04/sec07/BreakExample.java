package chap04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("while 반복을 끝내고 프로그램 종료");

	}

}
