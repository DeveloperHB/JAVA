package chap13.sec02.exam02;

public class CarAgency implements Rentable<Car>{
	//타입 파라미터 P를 Car 로 대체
	@Override
	public Car rent() {
		return new Car(); //리턴 타입이 반드시 Car 여야 함
	}

}
