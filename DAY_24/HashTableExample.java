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
			System.out.println("아이디와 비밀번호를 입력해 주세요.");
			System.out.println("ID : ");
			String id = sc.nextLine();
			System.out.println("Password : ");
			String password = sc.nextLine();
			if(map.containsKey(id)) {
				if(map.get(password).equals(password)) {
					System.out.println("로그인 되었습니다");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("아이디가 없어요");
			}
		}
		
		
	}

}
