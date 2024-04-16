package chap02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner Scanner= new Scanner(System.in);
		
		System.out.print("x값 입력 :");
		String strX = Scanner.nextLine(); //Enter 키를 누르면 입력한 모든 문자열을 읽어서 저장 
		//System.out.println("strx: " + strx);
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력 :");
		String strY = Scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y : " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열 :");
			String data = Scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			
			System.out.print("출력 문자열 :" + data);
			System.out.println();
		}
         		
		
		System.out.println("종료!!!");
		

	}

}
