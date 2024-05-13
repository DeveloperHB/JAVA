package chap17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		//rangeClosed(1, 100) : 1~100 범위 (끝수 포함) 정수 스트림 얻기
		//rangeClosed(1, 100) : 1~99 범위 (끝수 포함안함) 정수스트림 얻기
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
		
		
	}

}
