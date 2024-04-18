package chap05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9906251234567";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민 등록 번호가 자리수가 맞습니다");
			
		}else{
			System.out.println("주민 등록 번호가 자리수가 틀립니다");
		}

	}

}
