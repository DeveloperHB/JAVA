package chap05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores= {
				{80, 90, 96},
				{76, 88}
		};
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수):" + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생수):" + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생수):" + scores[1].length);
		
		//첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("scores[0][2]:" + scores[0][2]);
		//두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1]:" + scores[1][1]);
		//두 번째 반의 첫 번째 학생의 점수 읽기
		System.out.println("scores[1][0]:" + scores[1][0]);
		//첫 번째 반의 합계 점수 구하기
		int classSum = 0;
		for(int i=0; i<scores[0].length;i++) {
			classSum += scores[0][i];
		}
		System.out.println("첫 번째 반의 합계 점수 :"+classSum);
		double classAvg = (double) classSum/scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: "+classAvg);
		//두 번째 반의 합계 점수와 평균 점수 구하기
		int class2Sum = 0;
		for(int i=0; i<scores[1].length;i++) {
			class2Sum += scores[1][i];
		}
		System.out.println("두 번째 반의 합계 점수 :"+class2Sum);
		double class2Avg = (double) class2Sum/scores[1].length;
		System.out.println("두 번째 반의 평균 점수: "+class2Avg);
		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length; //반의 학생수 합산
		    for(int k=0; k<scores[i].length; k++) {//해당 반의 학생 수만큼 반복
		    	totalSum += scores[i][k];  //학생 점수 합산
		    }
		}
		double totalAvg = (double)totalSum / totalStudent;
		System.out.println("전체 학생의 평균점수: "+ totalAvg);

	}

}
