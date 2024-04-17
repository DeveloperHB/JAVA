package chap04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		
		float x;
		
		for(x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
		System.out.println("for 다음 문장 실행중 ==> x:"+x);
		

	}

}
