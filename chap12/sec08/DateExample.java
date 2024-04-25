package chap12.sec08;

import java.text.*;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		// Date 클래스 : 날짜 표현 클래스로 객체간에 날짜 정보를 주고 받을 때 사용
		// Date()생성자: 컴퓨터의 현재 날짜를 읽어 Date 객체로 만듦
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		/*SimpleDateFormat은 날자를 형식화된 문자열로 변환하는 기능을 제공함 
		 * format 메소드로 날짜를 제공하면 패턴과 동일한 문자열을 얻음
		 */
		System.out.println(strNow2);

	}

}
