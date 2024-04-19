package chap07.sec02;

public class SmartPhone extends Phone{ //상속 방법 : extends 부모클래스명
	//필드 선언
    public boolean wifi;
    
    //생성자 선언
    public SmartPhone(String model, String color) {
    	this.model = model;
    	this.color = color;
    }
    
    //메소드 선언
    public void setwifi(boolean wifi) {
    	this.wifi = wifi;
    	System.out.println("와이파이 상태를 변경했습니다.");
    }
    
    public void internet () {
    	System.out.println("인터넷에 연결합니다.");
    	
    }

	public void hangup() {
		// TODO Auto-generated method stub
		
	}

	public void receiveVoice(String string) {
		// TODO Auto-generated method stub
		
	}

}
