package chap05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		String[] season = {"Spring", "Summer", "Fall" , "Winter"};
		System.out.println("season[0]:" + season[0]);
		System.out.println("season[1]:" + season[1]);
		System.out.println("season[2]:" + season[2]);
		System.out.println("season[3]:" + season[3]);
		
		for(int i=0; i<season.length;i++) {
			System.out.println(season[i]);
		}
		season[1] = "여름";
		System.out.println("season[1]:" + season[1]);
		
		int[] scores = {83, 90, 87 , 60, 99,100 ,88};
		int sum = 0;
		for(int i=0; i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균:" +avg);
	}
	}

