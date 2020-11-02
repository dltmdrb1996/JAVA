
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바");
		
		if(index == -1) {
			System.out.println("자바없음");
		}else {
			System.out.println("자바있음");
			str =str.replace("자바", "java");
			System.out.println("--> "+str);
		}
	}

}
