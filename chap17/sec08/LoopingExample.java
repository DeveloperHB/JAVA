package chap17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5};
		
		//잘못 작성한 경우
		Arrays.stream(intArr)
		.filter(a -> a%2==0) //2 , 4
		.peek(n -> System.out.println(n)); //peek 중간처리 메소드
		//peek는 최종 처리가 없으므로 동작 안함
		
		//중간처리 메소드 peek를 이용해서 반복 처리
		int total = Arrays.stream(intArr)
				.filter(a -> a%2==0)
				.peek(n -> System.out.println(n)) //중간처리(동작)
				.sum(); //최종처리(2+4=6)
		System.out.println("총합:" + total);
		
		//최종 처리 메소드 forEach()를 이용해서 반복 처리
		Arrays.stream(intArr)
		.filter(a -> a%2==1)
		.forEach(n->System.out.println(n));
		

	}

}
