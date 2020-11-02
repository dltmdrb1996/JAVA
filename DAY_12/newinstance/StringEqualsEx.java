package newinstance;

public class StringEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("ThankYou");
		String strVar2 = "ThankYou";
		String strVar3 = "ThankYou";
		
		
		if(strVar1==strVar2) {
			System.out.println("°°Àº ½ºÆ®¸µ °´Ã¼");
		}else {
			System.out.println("´Ù¸¥ String °´Ã¼");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("°°Àº ½ºÆ®¸µ °´Ã¼");
		}else {
			System.out.println("´Ù¸¥ String °´Ã¼");
		}
		
		if(strVar2==strVar3) {
			System.out.println("°°Àº °´Ã¼");
		}else {
			System.out.println("´Ù¸¥ °´Ã¼"+ "");
		}
	}

}
