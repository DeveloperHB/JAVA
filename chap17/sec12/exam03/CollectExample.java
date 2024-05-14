package chap17.sec12.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap17.sec12.exam01.Student;

public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("신지드", "남", 92));
		totalList.add(new Student("다리우스", "여", 87));
		totalList.add(new Student("가렌", "남", 95));
		totalList.add(new Student("판테온", "여", 93));
		
		Map<String, Double> map = totalList.stream()
				.collect(
						Collectors.groupingBy(s->s.getSex(),
								Collectors.averagingDouble(s->s.getScore())
								)
						);
		System.out.println(map);
	}

}
