package chap17.sec08;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6};
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2==0);
		//allMatch() 모든 요소가 true를 리턴하는지 판별함
		System.out.println("모두 2의 배수인가?" +result);
		
		result = Arrays.stream(intArr)
				.anyMatch(a->a%3 == 0);
		//anyMatch() : 최소한 하나의 요소가 만족하면 true를 리턴
		System.out.println("하나라도 3의 배수가 존재하는가?" +result);
		
		//allMatch(),anyMatch(),noneMatch():요소들이 특정 조건에
		//만족하는 지 여부를 조사하는 최종 처리기능의 메소드임
		

	}

}
