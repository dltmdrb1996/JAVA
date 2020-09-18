package try_catch;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class C = Class.forName("Java.lang.String");
			System.out.println("클래스를 찾았습니다.");
		}catch(ClassNotFoundException e){
			String s = e.getMessage();
			System.out.println(s);
		}finally {
			System.out.println("프로그램종료");
			System.exit(0);
		}
		System.out.println("종료됨?");
	}

}
