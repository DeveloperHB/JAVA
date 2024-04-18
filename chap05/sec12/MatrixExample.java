package chap05.sec12;

public class MatrixExample {

	public static void main(String[] args) {
		//주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(중첩 for 문 이용)
		int[][] array= {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
		}
		double average = (double) sum / count;

        System.out.println("배열의 합: " + sum);
        System.out.println("배열의 평균: " + average);

	}

}
