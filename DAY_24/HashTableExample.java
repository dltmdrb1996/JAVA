import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new Hashtable<String , String>();	
		
		map.put("spring", "1234");
		map.put("summer", "12345");
		map.put("fall", "123456");
		map.put("winter", "1234567");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���.");
			System.out.println("ID : ");
			String id = sc.nextLine();
			System.out.println("Password : ");
			String password = sc.nextLine();
			if(map.containsKey(id)) {
				if(map.get(password).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�");
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("���̵� �����");
			}
		}
		
		
	}

}
