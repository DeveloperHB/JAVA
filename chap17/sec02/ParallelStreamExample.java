package chap17.sec02;

import java.util.*;
import java.util.stream.Stream;

//List 컬렉션의 내부 반복자를 이용해서 병렬 처리
public class ParallelStreamExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("임삿갓");
		list.add("가렌");
		list.add("트페");
		list.add("판테온");
		list.add("르블랑");
		list.add("샤코");
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		//병렬 스트림 얻기(parallelStream())
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
			                                 //어떤 스레드가 처리하는지 출력
		});

	}

}
