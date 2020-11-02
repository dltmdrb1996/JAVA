package nullex;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.nonNull(str2));
	
		System.out.println(Objects.requireNonNull(str1));
		try {
			System.out.println(Objects.requireNonNull(str2,"�̸�x"));
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
}
