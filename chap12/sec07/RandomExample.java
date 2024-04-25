package chap12.sec07;

import java.util.Arrays;
import java.util.Random;


public class RandomExample {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6]; //선택번호6개가 저장될 배열 생성
		Random random = new Random(8); //선택번호를 얻기 위한 Random객체 생성
		System.out.print("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; //선택번호 6개를 얻어 배열에 저장
			//nextInt(int n): int타입의 난수를 리턴(0<= ~<n)
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6]; //당첨번호 6개가 저장될 배열 생성
		random = new Random(8); // 당첨번호를 얻기 위한 Random 객체 생성
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " "); //당첨번호 6개를 얻어 배열에 저장
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber); // 배열 항목 정렬
		Arrays.sort(winningNumber); //비교하기 전에 배열 항목을 정렬시킴
		boolean result = Arrays.equals(selectNumber, winningNumber); //배열 항목 비교하기
		System.out.print("당첨여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
/* random 메소드 : 0.0~ 1.0 사이의 double 타입 난수를 리턴함
 * int num = (int)(Math.random()*n + start;
 * start 부터 시작하는 n개의 정수를 얻는 공식(start<= ~ <(start+n)
 */
/* java.util.Random 클래스를 이용 ==> Boolean, int, double 난수를 얻음
 * Random(): 현재 시간을 이용해서 종자값을 자동 설정함
 * Random(long seed): 주어진 종자값을 사용함, 종자값이 같으면 같은 난수 얻음		
 */
	}

}
