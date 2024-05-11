package practice.chap02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 8;
		int y = 7;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);

	}

}
