import java.util.Arrays;
import java.util.List;

public class ArrayasListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("ȫ�浿","�达","����","�ű�");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(35,73,64);
		for(int value : list2) {
			System.out.println(value);
		}
			
		
	}
}
