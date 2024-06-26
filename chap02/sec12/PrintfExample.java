package chap02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);//오른쪽 정렬
		System.out.printf("상품의 가격:%-6d원\n", value);  //왼쪽 정렬
		System.out.printf("상품의 가격:%06d원\n", value); //오른쪽 정렬이면서 빈칸은 0으로채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d 인 원의 넓이:%10.2f\n",10, area);
		
		String name = "임현배";
		String job ="프로그래머";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); 
		
		String name1 = "임봄";
		String job1 = "애완견";
		System.out.printf("%6d | %-10s | %10s\n", 2, name1, job1);
	}

}
