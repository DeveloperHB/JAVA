package chap04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">>>");//반복문 , ln지우기
			inputString= scanner.nextLine();
			System.out.println(inputString);
			
		} while( ! inputString.equals("q"));
		
		System.out.println("do ~ while 반복문을 벗어나 프로그램 종료");
		

	}

}
