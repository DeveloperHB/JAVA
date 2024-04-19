package chap08.sec04;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME =  0;
	
	//추상 메소드(메소드의 선언부만 작성함)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	

}
