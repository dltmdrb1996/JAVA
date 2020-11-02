package DAY_25;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(88), "ȫ�浿");
		scores.put(new Integer(78), "��浿");
		scores.put(new Integer(68), "���浿");
		scores.put(new Integer(58), "�̱浿");
		scores.put(new Integer(48), "��浿");
		
		Map.Entry<Integer,String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : "+entry.getKey() + " - "+ entry.getValue());
	
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : "+entry.getKey() + " - "+ entry.getValue());
		
		entry = scores.lowerEntry(80);
		System.out.println("80�� �Ʒ� ù���� : "+entry.getKey() + " - "+ entry.getValue());
		
		entry = scores.higherEntry(80);
		System.out.println("80�� ���� ù���� : "+entry.getKey() + " - "+ entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + " ���� ��ü �� : "+scores.size());
		}
	}

}
