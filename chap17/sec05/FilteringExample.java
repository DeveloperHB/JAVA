package chap17.sec05;

import java.util.*;

public class FilteringExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("자르반");
		list.add("제이스");
		list.add("우디르");
		list.add("제이스");
		list.add("럼블");
		
		//중복 요소 제거
		list.stream()
		.distinct()  //중복된 요소 제거해주는 메소드
		.forEach(n->System.out.println(n));
		System.out.println();
		
		//필터링 (자로 시작하는 요소만 필터링)
		list.stream()
		    .filter(n->n.startsWith("제"))
		    .forEach(n->System.out.println(n));
		System.out.println();
		
		//중복요소 먼저 제거
		list.stream()
		    .distinct()
		    .filter(n->n.startsWith("제"))
		    .forEach(n->System.out.println(n));
		//startsWith("문자열") : 주어진 문자열로 시작하면 true 리턴
		
		

	}

}
