package newinstance;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "æ»≥Á«œººø‰";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		System.out.println(bytes1);
		String str2 = new String(bytes1);
		System.out.println(str2);
		byte[] bytes3;
		byte[] bytes2;
		try {
			bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : "+bytes2.length);
			String str3 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 : "+str3);
			
			bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes2.length : "+bytes3.length);
			String str4 = new String(bytes3, "UTF-8");
			System.out.println("bytes2 : "+str4);
			System.out.println(bytes3);
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
	}

}
