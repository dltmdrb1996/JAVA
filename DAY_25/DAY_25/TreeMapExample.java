package DAY_25;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(88), "홍길동");
		scores.put(new Integer(78), "고길동");
		scores.put(new Integer(68), "정길동");
		scores.put(new Integer(58), "이길동");
		scores.put(new Integer(48), "김길동");
		
		Map.Entry<Integer,String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 작은 점수 : "+entry.getKey() + " - "+ entry.getValue());
	
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getKey() + " - "+ entry.getValue());
		
		entry = scores.lowerEntry(80);
		System.out.println("80점 아래 첫점수 : "+entry.getKey() + " - "+ entry.getValue());
		
		entry = scores.higherEntry(80);
		System.out.println("80점 위에 첫점수 : "+entry.getKey() + " - "+ entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + " 남은 객체 수 : "+scores.size());
		}
	}

}
