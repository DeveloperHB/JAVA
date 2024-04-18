package chap05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		System.out.println(location);
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요 !!!");
		}else {
			System.out.println("자바와 관련없는 책이군요 !!!");

	}
		boolean result = subject.contains("JAVA");
		if (result) {
			System.out.println("자바와 관련된 책이군요 !!!");
		}else {
			System.out.println("자바와 관련없는 책이군요 !!!");
		}
	}
}
 