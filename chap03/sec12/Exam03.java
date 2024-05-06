package practice.chap03.sec12;

public class Exam03 {

	public static void main(String[] args) {
		int pencils = 32768;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수 
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
				

	}

}
