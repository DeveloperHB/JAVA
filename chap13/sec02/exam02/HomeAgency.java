package chap13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{ 
	//타입 파라미터 P를 Home 으로 대체
	@Override
	public Home rent() {    
		return new Home();  //리턴 타입이 반드시 Home 이어야 함
	}

}
