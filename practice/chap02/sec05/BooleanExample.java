package practice.chap02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("Stop");
		}else {
			System.out.println("Keep going");
		}
		
		int x = 365;
		boolean result1 = (x == 300);
		boolean result2 = (x != 300);
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
			

	}

}
