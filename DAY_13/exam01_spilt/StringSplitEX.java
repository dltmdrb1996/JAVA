package exam01_spilt;

public class StringSplitEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Ȧ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		
		String[] names = text.split("&|,|-");
		
		for(String name :  names) {
			System.out.println(name);
		}
	}

}
