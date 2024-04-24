package chap12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println("Value:" + obj.intValue()); 
		//intValue()메소드는 integer 객체 내부의 int 값을 리턴한다.
		
		//UnBoxing
		int value = obj;
		System.out.println("value" + value);
		
		//연산 시 UnBoxing
		int result = obj + 100;
		System.out.println("result:" + result);

	}

}
