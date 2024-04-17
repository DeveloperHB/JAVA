package chap03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1=(num1 == num2);
		boolean result2=(num1 != num2);
		boolean result3=(num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		boolean result4 = (char1 < char2);
		System.out.println("result4: " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5 :" + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6=(num5 == num6);
		System.out.println("result6:" +result6);
		boolean result7=(num5 == (float)num6);
		System.out.println("result7:" +result7);
		
		String str1 = "자바";
		String str2 = "JAVA";
		boolean result8 = (str1.equals(str2));//equls 메소드는 문자열이 같은지 비교할 때 사용
		System.out.println("result8:" + result8);
		boolean result9 = (!str1.equals(str2));
		System.out.println("result9:" + result9);
		
		char char3 = 'C'; //67
		char char4 = 'U'; //?
		boolean result10 = (char3 <= char4);
		System.out.println("result10: " + result10);
		
		int num7 = 7;
		double num8 = 8.8;
		boolean result11 = (num7!=num8);
		System.out.println("result11: "+ result11);
		
		float num9 = 0.8f;
		double num10 = 0.8;
		boolean result12= (num9 != num10 );
		System.out.println("result12" +result12);
		

	}

}
