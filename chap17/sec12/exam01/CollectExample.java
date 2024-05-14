package chap17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("신지드", "남", 92));
		totalList.add(new Student("다리우스", "여", 87));
		totalList.add(new Student("가렌", "남", 95));
		totalList.add(new Student("판테온", "여", 93));
		
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.toList();
		
		maleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect( 
						Collectors.toMap(
								s->s.getName(),
								s->s.getScore()
								)
						);
		
		System.out.println(map);
				
		
		

	}

}
