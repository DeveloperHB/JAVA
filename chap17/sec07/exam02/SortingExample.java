package chap17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("가렌", 70));
		studentList.add(new Student("티모", 60));
		studentList.add(new Student("럼블", 80));
		studentList.add(new Student("다리우스", 90));
		//점수 ==> 오른차순 정렬
		studentList.stream()
		.sorted((s1,s2)->Integer.compare(s1.getScore(), s2.getScore()))
        .forEach(s -> System.out.println(s.getName()+":" +s.getScore()));
        System.out.println();
        
        //점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
        .sorted((s1,s2) -> Integer.compare(s2.getScore(), s1.getScore()))
        .forEach(s -> System.out.println(s.getName() +":" +s.getScore()));

	}

}
