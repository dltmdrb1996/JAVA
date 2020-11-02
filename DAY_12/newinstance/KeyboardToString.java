package newinstance;

import java.io.IOException;

public class KeyboardToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];
		
		System.out.println("문자 입력 : ");
		try {
			int readByteNo= System.in.read(bytes);
			String str = new String(bytes , 0 , readByteNo-2);
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
