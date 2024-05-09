package chap15.sec09.exam10;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("리신", 96));
		treeSet.add(new Student("트페", 86));
		treeSet.add(new Student("딩거", 92));
		
		Student student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);

	}

}
