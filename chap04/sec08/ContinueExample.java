package chap04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0 ) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("for 다음 문장 실행중!!!");

	}

}
