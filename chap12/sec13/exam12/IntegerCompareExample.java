package chap12.sec13.exam12;

public class IntegerCompareExample {

	public static void main(String[] args) {
		// 값의 범위가 -128~127이면 ==은 값을 비교하고 그 이외에는 번지를 비교하기 때문이다.
		 Integer obj1 = 100;
		 Integer obj2 = 100;
		 Integer obj3 = 300;
		 Integer obj4 = 300;
		 System.out.println( obj1.equals(obj2) );
		 System.out.println( obj3.equals(obj4) ); 

	}

}
