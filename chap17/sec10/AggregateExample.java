package chap17.sec10;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		//정수 배열
		int[] arr = {1, 2, 3, 4, 5};
		//count() : 요소 개수 구함
		long count = Arrays.stream(arr)
				.filter(n -> n%2 == 0) //2,4
				.count(); //요소 개수 (최종처리 기능의 메소드)
		System.out.println("2의 배수 개수 : "+ count);
		//sum(): 요소의 총합을 구함
		long sum = Arrays.stream(arr)
				.filter(n -> n%2 == 1) //1,3,5
				.sum(); //요소의 총합을 구함(최종처리 기능의 메소드)
		System.out.println("홀수(1,3,5)의 합계: "+sum);
		
		//요소의 평균을 구함
		double avg = Arrays.stream(arr)
				.filter(n -> n%2 == 0)//1,3,5
				.average() //요소의 평균을 구함
				.getAsDouble();
		System.out.println("2의 배수의 평균" + avg);
		
		//최대값
		int max = Arrays.stream(arr)
				.filter(n -> n%2 == 1) //1,3,5
				.max() //요소의 최대값을 구함
				.getAsInt();
		System.out.println("최대값:" + max);
		//최소값
		int min = Arrays.stream(arr)
				.filter(n -> n%2 == 1)
				.min()
				.getAsInt();
		System.out.println("최소값:" + min);
		
		//첫 번째 요소
		int first = Arrays.stream(arr)
				.filter(n -> n%3 == 0)
				.findFirst()
				.getAsInt();
		System.out.println("첫 번째 3의 배수:" + first);
		
		//최종값을 저장하는 객체로 get(), getAsDouble(), getAsInt()
		//getAsLong()을 호출하면 최종값을 얻을 수 있음
	}

}
