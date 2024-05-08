package chap15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//객체 저장
		treeSet.add(new Person("하딩거",44));
		treeSet.add(new Person("이딩거",22));
		treeSet.add(new Person("머딩거",11));
		
		//객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}

		
	}

}
