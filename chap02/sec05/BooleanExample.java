package chap02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = false;
		if (stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		 }
		int x = 10;
		boolean result1 = (x == 20); // == 은 같다
		boolean result2 = (x != 20); // != 은 같지않다
		boolean result3 = (0<x && x<20); //&&은 AND조건
		boolean result6 = (0<x && x<8);
		boolean result4 = (x<0 || x>20); //||은 or 조건
		boolean result5 = (x<0 || x>8);
				
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
		
		
		}

}
