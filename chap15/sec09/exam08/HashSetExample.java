package chap15.sec09.exam08;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"하이머딩거"));
	    set.add(new Student(2, "리신"));
	    set.add(new Student(1, "비에고"));
	    
	    System.out.println("저장된 객체 수: " + set.size());
	    for(Student s : set) {
	    	System.out.println(s.studentNum + ":" + s.name);
	    }

	}

}
