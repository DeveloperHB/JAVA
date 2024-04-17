package chap04.sec06;

import java.util.Scanner;

public class WhileScannerExample {

	public static void main(String[] args) {
		//Exam:while 문과 Scanner의 nextline() 메소드를 이용해서 다음 실행 결과와 같이
		//키보드로부터 입력된 데이터로 예금,출금,조회,종료기능을 제공하는 코드를 작성해보세요.
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		
		while (true) {
			
            System.out.println("원하는 작업을 선택하세요:");
            System.out.println("1. 예금");
            System.out.println("2. 출금");
            System.out.println("3. 조회");
            System.out.println("4. 종료");

            String choice = scanner.nextLine();
            
            switch (choice) {
            
                case "1":
                    System.out.println("예금할 금액을 입력하세요:");
                    int depositAmount = Integer.parseInt(scanner.nextLine());
                    balance += depositAmount;
                    System.out.println("예금이 완료되었습니다.");
                    break;
                case "2":
                    System.out.println("출금할 금액을 입력하세요:");
                    int withdrawAmount = Integer.parseInt(scanner.nextLine());
                    if (withdrawAmount > balance) {
                        System.out.println("잔액이 부족합니다.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("출금이 완료되었습니다.");
                    }
                    break;
                case "3":
                    System.out.println("현재 잔액은 " + balance + "원 입니다.");
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
	      }
		}
}
