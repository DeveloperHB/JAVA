package chap11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length(); //<---data가 null일 경우 NullPointerException 발생
			System.out.println("문자 수: " + result);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());  //1 예외가 발생한 이유만 리턴함
			//System.out.println(e.toString());  //2 예외의 종류도 같이 리턴  <--예외 정보를 얻는 3가지 방법
			//e.printStackTrace();               //3 예외가 어디서 발생했는지 추적한 내용까지 리턴
		}finally {
			System.out.println("[마무리 실행]\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);   //<------매개값으로 null을 대입
		System.out.println("[프로그램 종료]");

	}

}
