package chap12.sec08;

import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {
		//getInstance(): 컴퓨터에 설정된 시간대 기준으로 Calendar하위 객체를 얻음
		Calendar now = Calendar.getInstance();
		/* get() 메소드의 매개값으로 Calendar 에 정의된 상수를 주면
		 * 상수가 의미하는 값을 리턴함
		 */
				
		int year = now.get(Calendar.YEAR);//년도를 리턴
		int month = now.get(Calendar.MONTH) + 1;//월을 리턴
		int day = now.get(Calendar.DAY_OF_MONTH);//일 리턴
		int week = now.get(Calendar.DAY_OF_WEEK);//요일 리턴
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:    strWeek = "월"; break;
		case Calendar.TUESDAY:   strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.THURSDAY:  strWeek = "목"; break;
		case Calendar.FRIDAY:    strWeek = "금"; break;
		case Calendar.SATURDAY:  strWeek = "토"; break;
		default:                 strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM); //오전/오후 리턴
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
			
		}
		
		int hour = now.get(Calendar.HOUR); //시를 리턴
		int minute = now.get(Calendar.MINUTE); //분을 리턴
		int second = now.get(Calendar.SECOND); //초를 리턴
		
		System.out.print(year+ "년 ");
		System.out.print(month+ "월 ");
		System.out.println(day + "일");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");

	}

}
