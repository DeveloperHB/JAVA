package chap05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "8806454234567";
		char s = ssn.charAt(6);
		switch (s) {
		case '1' :
		case '3' :
			System.out.println("남자입니다");
			break;
		case '2' : 
			System.out.println("여자입니다");
			break;	
		case '4' :
			System.out.println("외국인입니다");
		}

	}

}
