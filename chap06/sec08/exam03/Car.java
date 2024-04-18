package chap06.sec08.exam03;

public class Car {
    //필드 선언
	int gas;
	//리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경함
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas( ) {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; //false를 리턴하고 메소드를 종료함
		}
		System.out.println("gas가 있습니다.");
		return true; //true를 리턴하고 메소드 종료
	}
	//리턴값이 없는 메소드호 gas 필드값이 0 이면 return 문으로 메소드를 종료
	void run( ) {
		while(true) {
			if(gas>0) {
				System.out.println("자동차가 달립니다.(gas잔량: " + gas +")");
				gas -= 1;
				
			}else {
				System.out.println("자동차가 멈춥니다.(gas잔량:" + gas +")");
				return;//메소드 종료
			}
		}
	}
	
}
