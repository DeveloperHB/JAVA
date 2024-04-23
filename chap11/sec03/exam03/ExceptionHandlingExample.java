package chap11.sec03.exam03;

import chap08.sec10.exam01.E;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			}   catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨:" + e.getMessage());
			}   catch(NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
				/*예외클래스를 | 기호로 연결하여 2가지 이상의 예외를
				 *하나의 catch 블록으로 동일하게 예외처리함
				 */
			}
		}

	}

}
