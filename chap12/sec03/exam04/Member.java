package chap12.sec03.exam04;

/*record 선언
 * 데이터 전달을 위한 DTO 작성시 반복적으로 사용되는 코드를 줄이기 위해 도입
 */

public record Member(String id, String name, int age) {
	/*class 대신 record로 대체하고 레코드 이름 뒤에
	 *괄호를 작성해서 저장할 데이터의 종류를 변수로 선언함
	 */

}
