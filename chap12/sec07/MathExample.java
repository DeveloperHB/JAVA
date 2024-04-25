package chap12.sec07;

public class MathExample {

	public static void main(String[] args) {
		//큰 정수 또는 작은 정수 얻기
		double v1 = Math.ceil(5.3); //올림값을 구할 때 사용하는 메소드
		double v2 = Math.floor(5.3); //내림값(버림값)을 구할 때 사용하는 메소드
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		
		//큰값 또는 작은값 얻기 
		long v3 = Math.max(3, 7); //최대값을 구할 때 사용하는 메소드
		long v4 = Math.min(3, 7); //최소값을 구할 때 사용하는 메소드
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		
		//소수 이하 두 자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		System.out.println("temp1=" + temp1);
		long temp2 = Math.round(temp1); //반올림
		System.out.println("temp2=" + temp2);
		double v5 = temp2 / 100.0;
		System.out.println("v5=" +v5);
		int v6 = Math.abs(-100); //절대값
		System.out.println("v6=" +v6);
	}

}
