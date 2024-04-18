package chap05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores; // 배열 변수 선언
		scores = new int[] {83, 90, 87}; // 배열 변수에 데이터를 대입함
		int sum1 = 0;
		for(int i=0; i<3; i++) { //총합 구하기
			sum1 += scores[i];
		}
		System.out.println("총합 :" + sum1);
		
		//배열을 매개값으로 주고, printItem() 메소드 호출
		printItem(new int[] {83, 90, 87});
		System.out.println();
		printItem(new int[] {52, 77, 52});

	}
	//printItem() 메소드 선언
	public static void printItem(int[]scores) {
		//매개 변수가 참조하는 배열의 항목을 출력함
		for(int i=0; i<3; i++) {
			System.out.println("scores["+i+"] : "+scores[i]);
		}
	}

}
