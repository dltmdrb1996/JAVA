import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student2 , Integer> map = new HashMap<Student2 , Integer>();
		
		map.put(new Student2(1, "ȫ�浿"), 95);
		map.put(new Student2(1, "ȫ�浿"), 953434);
		
		System.out.println("�� ��ü�� �� : "+map.size());
		System.out.println(map.get(new Student2(1,"ȫ�浿"))); //1ȸ�� ����?
		
		
	}
}
