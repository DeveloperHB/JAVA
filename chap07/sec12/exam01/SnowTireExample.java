package chap07.sec12.exam01;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}

}           //스노우 타이어가 굴러갑니다.
            //스노우 타이어가 굴러갑니다.

