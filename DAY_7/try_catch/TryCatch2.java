package try_catch;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class C = Class.forName("Java.lang.String");
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
		}catch(ClassNotFoundException e){
			String s = e.getMessage();
			System.out.println(s);
		}finally {
			System.out.println("���α׷�����");
			System.exit(0);
		}
		System.out.println("�����?");
	}

}
