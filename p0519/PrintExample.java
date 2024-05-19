package p0519;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%06d원\n",value);
		
		double area = 3.14159 * 100 * 100;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 100, area);
		
		String name = "제드";
		String job = "암살자";
		System.out.printf("%6d | %-10s | %10s\n", 8, name, job);

	}

}
