import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("ȫ�浿",85);
		map.put("������",90);
		map.put("���̳�",80);
		map.put("������",95); // ����Ⱑ��
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyiIterator = keySet.iterator();
		while(keyiIterator.hasNext()) {
			String key = keyiIterator.next();
			Integer value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		System.out.println();
		
		// entrySet() �޼ҵ带 �̿��Ͽ� �÷����� ��ü�� ������
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		map.clear();
		System.out.println("�� ��ü �� : "+map.size());
				
			
	}
}
