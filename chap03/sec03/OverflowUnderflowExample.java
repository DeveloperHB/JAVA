package chap03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		System.out.println("--오버플로우------------");
		byte var1= 125;
		for(int i=0; i<5; i++) {//{} 를 5번 반복실행
			var1++; //var1 값을 1증가시킴
			System.out.println("var1 :"+ var1);
		}
		
		System.out.println("--언더플로우------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {//{}를 5번 반복 실행
			var2--; // var2의 값을 1씩 감소시킴
			System.out.println("var2 :"+ var2);
			
		}
		
		
	}

}
