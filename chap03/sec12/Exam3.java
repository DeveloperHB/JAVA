package chap03.sec12;

public class Exam3 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0; //0.0이 아닌 수에는 result 값이 나옴.
		double z = 5%y;
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z+10;
			System.out.println("결과:" +result);
		}

	}

}
