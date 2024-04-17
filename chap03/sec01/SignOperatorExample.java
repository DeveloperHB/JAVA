package chap03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: "+x);
		
		byte b = 100;
		int y = -b; // 부호 변경도 연산에 해당하므로 int 타입에 대입함
		System.out.println("y: "+y);

	}

}
