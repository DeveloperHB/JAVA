package chap15.sec09.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("트페", 96);
		map.put("하이머딩거", 86);
		map.put("리신", 100);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
				for(Map.Entry<String,Integer> entry : entrySet) {
					if(entry.getValue()>maxScore) {
						name = entry.getKey();
						maxScore = entry.getValue();
					}
					totalScore += entry.getValue();
				}
		int avgScore = totalScore / map.size(); //평균
		System.out.println("평균 점수: " + avgScore);
		
		System.out.println("최고 점수: " + maxScore);
		
		System.out.println("최고 점수를 받은 아이디: " + name );

	}

}
