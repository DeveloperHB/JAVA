package chap12.sec13.exam17;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		String id = "5Angel004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{8,12}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
	  	}else {
	  		System.out.println("ID로 사용할 수 없습니다.");
	  	}

	}

}
