package chap12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		// -128~ 127 초과값일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==:" + (obj1 == obj2));
		System.out.println("equals():" + obj1.equals(obj2));
		System.out.println();
		
		
		// -128~127 범위값일 경우
		/* 포장 객체의 효율적 사용을 위해 byte, short, int 타입이
		 * ~128~127 범위값일 경우의 포장 객체는 ==(equals) 공유 가능
		 * ==와 equals 메소드는 같은 의미로 사용됨
		 */
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==:" + (obj3 == obj4));
		System.out.println("equals:" + obj3.equals(obj4));

	}

}
