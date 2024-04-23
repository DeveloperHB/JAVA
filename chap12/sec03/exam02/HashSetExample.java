package chap12.sec03.exam02;

import java.util.HashSet;  //HashSet java.util 패키지에 있으므로 import해야 함

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();   //HashSet 컬렉션 생성
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1); //HashSet에 Student 객체 저장
		System.out.println("저장된 객체 수:" + hashSet.size());
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2); //HashSet에 Student 객체 저장
		//동등 객체는 중복 저장하지 않음
		System.out.println("저장된 객체 수:" + hashSet.size());
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3); //HashSet에 Student 객체 저장
		System.out.println("저장된 객체 수:" + hashSet.size());

	}

}
