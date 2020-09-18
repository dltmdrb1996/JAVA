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
			System.out.println("찾는 배열의 인덱스가 없음");
			return;
		}
		
		
		try {
			int value1= Integer.parseInt(data1);
			int value2= Integer.parseInt(data2);
			int result= value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자 변환에 실패하였습니다.");
		}finally {
			System.out.println("다시 실행시켜 주십이오");
		}
	}

}
