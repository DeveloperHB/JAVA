package p0518;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자연산
		int result = 10 + 2 + 8;
		System.out.println("result: " + result);
		
		//결합 연산
		String result2 = 10 + 2+ "8";
		System.out.println("result2:" + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3:" + result3);
		
		String result4 = 1024 + "06" + 19;
		System.out.println("result4:" + result4);
		
		String result5 = "88" + (10+44);
		System.out.println("result5:" + result5);
				

	}

}
