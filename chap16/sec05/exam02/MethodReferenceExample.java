package chap16.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person ();
		person.ordering(String :: compareToIgnoreCase);
		
		/*사람의 이름을 비교하기 위해서 String의 인스턴스 메소드인
		 * compareToIgnoreCase 를 메소드 참조로 사용함
		 */

	}

}
