
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
		
		if(index == -1) {
			System.out.println("�ڹپ���");
		}else {
			System.out.println("�ڹ�����");
			str =str.replace("�ڹ�", "java");
			System.out.println("--> "+str);
		}
	}

}
