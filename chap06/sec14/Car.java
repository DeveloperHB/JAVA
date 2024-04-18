package chap06.sec14;

public class Car {
	//필드 선언
	private int speed;
	private boolean stop;
	
	//Source generate getters and setters
	//Setter : 데이터를 검증해서 유효한 값만 필드에 저장하는 메소드
	/*Getter : 필드값이 객체 외부에서 사용하기에 부적절한 경우,
	 * 적절한 값으로 변환해서 리턴할 수 있는 메소드
	 */
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		
		}
		
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
	
	

}
