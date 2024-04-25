package chap12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		/* TimeZone.getAvailableIDs()
		 * 모든 시간대 ID를 출력함
		 */
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}

	}

}
