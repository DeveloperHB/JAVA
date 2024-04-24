package chap12.sec03.exam05;

import lombok.Data;

import lombok.NonNull;
/*@Data
 * 컴파일 과정에서 기본 생성자와 함께 Getter, Setter, hashCode(),
 * equals(), toString() 메소드가 자동 생성됨
 */
@Data
public class Member {
	//final 과 @NonNull 필드만 초기화시키는 생성자를 포함시킴
	private final String id;
    @NonNull private String name;
    private int age;

	/*@NonNull
	 * null이 아닌 다른 값으로 Setter 메소드를 변경할 수 있음
	 */
	

}
