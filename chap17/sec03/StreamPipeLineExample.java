package chap17.sec03;

import java.util.Arrays;
import java.util.List;


public class StreamPipeLineExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("임삿갓", 10),
				new Student("르블랑", 20),
				new Student("빵테온", 30)
				);
		//방법1
		/*
		Stream<Student> studentStream = list.stream();
		//Student 객체를 점수로 매핑
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		//평균
		double avg = scoreStream.average().getAsDouble();
		*/
		
		//방법2
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균 점수"+avg);

	}

}
