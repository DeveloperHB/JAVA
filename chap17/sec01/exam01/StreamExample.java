package chap17.sec01.exam01;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("임삿갓");
		set.add("리신");
		set.add("가렌");
		
		//Stream 을 이용한 요소 반복 처리
		Stream<String> stream = set.stream(); // 스트림 얻기
		stream.forEach(name -> System.out.println(name));
		//람다식 : Stream 요소 처리 방법

	}

}
