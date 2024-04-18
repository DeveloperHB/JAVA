package chap06.sec11.exam01;

public class Korean {
	//인스턴스 final 필드 선언
	//final필드는 초기값이 저장되면 최종값이 됨==> 수정할 수 없음
	final String nation = "대한민국";
	final String ssn;
	
	//인스턴스 필드 선언
	String name;
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
