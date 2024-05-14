package chap17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("자크",92),
				new Student("샤코",95),
				new Student("이블린",88)
				);
				//방법1
		int sum1 = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
			
		int sum2 = studentList.stream()
				.map(Student::getScore)
				.reduce(0,(a,b)->a+b);
		System.out.println("sum1:" + sum1);
		System.out.println("sum2:" + sum2);
}
}