package newinstance;

public class StringEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("ThankYou");
		String strVar2 = "ThankYou";
		String strVar3 = "ThankYou";
		
		
		if(strVar1==strVar2) {
			System.out.println("���� ��Ʈ�� ��ü");
		}else {
			System.out.println("�ٸ� String ��ü");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ��Ʈ�� ��ü");
		}else {
			System.out.println("�ٸ� String ��ü");
		}
		
		if(strVar2==strVar3) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü"+ "");
		}
	}

}
