package runtime;

public class TryCatchRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data1 = args[1];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ã�� �迭�� �ε����� ����");
			return;
		}
		
		
		try {
			int value1= Integer.parseInt(data1);
			int value2= Integer.parseInt(data2);
			int result= value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("���� ��ȯ�� �����Ͽ����ϴ�.");
		}finally {
			System.out.println("�ٽ� ������� �ֽ��̿�");
		}
	}

}
