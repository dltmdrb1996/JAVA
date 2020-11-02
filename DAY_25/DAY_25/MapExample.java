package DAY_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer> map = new HashMap<String , Integer>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		
		int maxScore=0;
		int totalScore=0;
		String id = null;
		Set<Map.Entry<String , Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(maxScore<entry.getValue()) {
			maxScore=entry.getValue();
			id=entry.getKey();
			}
			totalScore+=entry.getValue();
		}
		System.out.println("평균점수:"+totalScore/entrySet.size());
		System.out.println("최고점수:"+maxScore);
		System.out.println("아이디 :"+id);
		
	}

	private static String getKey(Map<String, Integer> map, int maxScore) {
		// TODO Auto-generated method stub
		return null;
	}
}