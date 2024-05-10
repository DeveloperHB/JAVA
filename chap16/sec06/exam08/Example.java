package chap16.sec06.exam08;

public class Example {
	private static Student[] students = {
			new Student("비에고", 90, 96),
			new Student("리신",95, 93)
	};
	
	//avg() 메소드 작성
	public static double avg(Function<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.apply(student);
		}
		double avg = (double) sum / students.length;
		return avg;
	}
	
	

	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());
		//double englishAvg = avg(Student::getEnglishScore); <-메소드 참조로 변경
		System.out.println("영어 평균 점수:" + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		//double mathAvg = avg(Student::getMathScore);  <-메소드 참조로 변경
		System.out.println("수학 평균 점수:" + mathAvg);

	}

}
