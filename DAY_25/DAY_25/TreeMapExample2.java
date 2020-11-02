package DAY_25;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[]args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(68), "정길동");
		scores.put(new Integer(88), "홍길동");
		scores.put(new Integer(48), "김길동");
		scores.put(new Integer(78), "고길동");
		scores.put(new Integer(58), "이길동");
		
		
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.println(entry.getKey()+ " - " +entry.getValue()+ " ");
		}
		System.out.println();
	
		NavigableMap<Integer, String> ascendingMap = scores.descendingMap().descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.println(entry.getKey()+ " - " +entry.getValue()+ " ");
		}
		System.out.println();
		
	}
}
