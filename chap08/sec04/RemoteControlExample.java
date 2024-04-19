package chap08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rcTv;
		rcTv = new Television();
		RemoteControl rcAudio;
		rcAudio = new Audio() ;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		
		rcTv. turnOn();
		rcTv.setVolume(-30);
		rcTv.setVolume(8);
		rcTv.setVolume(4);
		rcTv.setVolume(15);
		rcTv.turnOff();
		
		System.out.println("-----------------------");
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		
		rcAudio.turnOn();
		rcAudio.setVolume(-7);
		rcAudio.setVolume(7);
		rcAudio.setVolume(7);
		rcAudio.setVolume(15);
		rcAudio.turnOff();

	}

}
