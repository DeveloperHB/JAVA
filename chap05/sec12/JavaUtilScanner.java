package chap05.sec12;

import java.util.Scanner;

public class JavaUtilScanner {

		public static void main(String[] args) {
			//학생들의 점수를 분석하는 프로그램을 만들려고 합니다.
			//키보드로부터 학생 수와 각 학생들의 점수를 입력받고
			//while문과 scanner의 nextline()메소드를 이용해서
			//최고 점수 및 평균점수를 출력하는 코드를 작성해보세요.

			//1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료
			//선택>1 //학생수 3
			//score|0|>85
			//score|1|>95
			//score|2|>93  
			
			Scanner scanner = new Scanner(System.in);
			
			int[] scores = null;
			
	        while (true) {	       
	            System.out.println("//1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
	            System.out.print("//선택> ");
	            int choice = scanner.nextInt();

	            if (choice == 1) {
	                System.out.print("학생 수를 입력하세요: ");
	                int numStudents = scanner.nextInt();
	                scores = new int[numStudents];
	                for (int i = 0; i < numStudents; i++) {
	                    System.out.print("score|" + i + "|> ");
	                    scores[i] = scanner.nextInt();
	                }
	            } else if (choice == 2) {
	                if (scores == null) {
	                    System.out.println("학생 수를 먼저 입력하세요.");
	                } else {
	                    System.out.println("점수 리스트:");
	                    for (int i = 0; i < scores.length; i++) {
	                        System.out.println("score|" + i + "|> " + scores[i]);
	                    }
	                }
	            } else if (choice == 3) {
	                if (scores == null) {
	                    System.out.println("학생 수를 먼저 입력하세요.");
	                } else {
	                    analyze(scores);
	                }
	            } else if (choice == 4) {
	                if (scores == null) {
	                    System.out.println("학생 수를 먼저 입력하세요.");
	                } else {
	                    analyze(scores);
	                }
	            } else if (choice == 5) {
	                System.out.println("프로그램을 종료합니다.");
	                System.exit(0);
	            } else {
	                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
	            }
	        }
	    }

		private static void analyze(int[] scores) {
	        int sum = 0;
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        for (int score : scores) {
	            sum += score;
	            if (score > max) {
	                max = score;
	            }
	            if (score < min) {
	                min = score;
	            }
	        }

	        double average = (double) sum / scores.length;
	        System.out.println("평균 점수: " + average);
	        System.out.println("최고 점수: " + max);
	        System.out.println("최저 점수: " + min);
	    }
	}