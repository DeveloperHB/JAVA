package chap17.sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("자르반37세", 37));
		studentList.add(new Student("리신", 10));
		studentList.add(new Student("벡스", 20));
		
		//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
		  .sorted()
		  .forEach(s->System.out.println(s.getName()+": "+s.getScore()));
		System.out.println();
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

	}

}
