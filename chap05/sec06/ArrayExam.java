package chap05.sec06;

public class ArrayExam {

	public static void main(String[] args) {
		//Exam.주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요(for 문 이용)
		//최소값도 작성
		//int[] array = {1,5,3,8,2};
		
		
		 int[] array = {1, 5, 3, 8, 2};
	        int min = array[0]; // 배열의 첫 번째 요소를 최저값으로 초기화
	        int max = array[0]; // 배열의 첫 번째 요소를 최대값으로 초기화

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) { // 배열의 현재 요소가 최저값보다 작은 경우
	                min = array[i]; // 최저값을 현재 요소로 업데이트
	            }

	            if (array[i] > max) { // 배열의 현재 요소가 최대값보다 큰 경우
	                max = array[i]; // 최대값을 현재 요소로 업데이트
	            }
	        }

	        System.out.println("최저값: " + min);
	        System.out.println("최대값: " + max);
	    }
	}
