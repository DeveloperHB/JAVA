package chap12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// ():선택, {}:중괄호안에 오는 숫자 만큼 반복 
		String data = "010-1234-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\W+@\\W+\\.==W+(\\.\\W+)?";
		// \w+ (영문자 1개이상) , \.는 .을 반드시 표시
		// (\\/\\w)?==>없거나 한번 더 반복할 수 있음
		data = "angel@mycompanycom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}
