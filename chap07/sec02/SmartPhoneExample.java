package chap07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시" , "금색");
		
		
		//Phone(상속받은 부모클래스)으로 부터 상속받은 필드 읽기
		System.out.println("모델:" + myPhone.model);
		System.out.println("색상:" + myPhone.color);
		
		//Phone 으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요~~");
		myPhone.receiveVoice("안녕하세요!! 저는 홍길동입니다.");
		myPhone.sendVoice("아 !! 네, 반갑습니다.!!!");
		myPhone.hangup();
		
		//SmartPhone 메소드 호출
		myPhone.setwifi(false);
		myPhone.setwifi(true);
		myPhone.internet();

	}

}
