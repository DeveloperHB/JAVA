package chap04.sec10;

public class ForExample3 {

	public static void main(String[] args) {
		//for문 이용
		//1~100까지 정수중에서 3의 배수의 총합?
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) { //%는 나머지 연산자
				sum += i;
			}
		}
		System.out.println("3의 배수의 합계 =" + sum);

		
}
}

	
