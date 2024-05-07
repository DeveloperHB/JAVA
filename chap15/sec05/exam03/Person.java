package chap15.sec05.exam03;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1; //나이가 적으면 -1 리턴
		else if(age == o.age) return 0; //나이가 같으면 0 리턴
		else return 1; //나이가 크면 1리턴
	}
	
	//나이를 기준으로 Person 객체를 오름차순으로 정렬하기 위해 
	//Comparable 인터페이스를 구현 (compareTo 메소드 재정의)

}
