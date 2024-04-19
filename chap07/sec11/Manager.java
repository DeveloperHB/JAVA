package chap07.sec11;

public non-sealed class Manager extends Person{
	//non-sealed는 봉인을 해제함
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}


}
