package chap02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15; //전역변수 v1 선언
		
		if(v1>10) {
          int v2 = v1 - 10; //지역변수 v2 선언
          System.out.println("v2 =" + v2);
      }
      // int v3= v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
		int v3= v1 + 5;
       System.out.println("v3 = " + v3);	
	}
	

}
