package chap04.sec05;

public class PrintFrom1to10Example {

	public static void main(String[] args) {
		int i=1;
		while(i<=10)  {
			System.out.println(i);
			i += 2;
		}
		System.out.println("while 다음 문장 실행중 !!!==> i : " + i);

	}

}
