package chap03.sec05;

public class InfinityAndNaNcheckExample {

	public static void main(String[] args) {
		int x=5;
		double y=0.0;
		//double z=x/y; //Infinity(무한대) 출력
		double z = x% y; // NaN(Not a Number) 출력
		System.out.println(z);
		//잘못된 코드
		System.out.println(z+2);
				
		//알맞은 코드
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("값을 산출 할 수 없음");
		}else {
			System.out.println(z+2);
		}

	}

}
