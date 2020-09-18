package exception;

public class CatchByKind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String data1 = args[0];
		String data2 = args[1];
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + " = " + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수값의 수 부족");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환하는데 실패");
		}finally {
			System.out.println("다시 실행해 주세요");
		}
	}

}
