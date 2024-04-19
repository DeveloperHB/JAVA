package chap07.sec11;

public sealed class Person permits Employee, Manager {
	  //sealed 키워드를 사용하면 permits 키워드 뒤에 상속 가능한 클래스를 지정함
	//필드
	public String name;
	
	//메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}

}
