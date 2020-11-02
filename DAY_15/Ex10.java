import java.util.regex.Pattern;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "5Angel1004";
		String regExp ="[a~zA-Z]\\w+{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있다");
		}else {
			System.out.println("ID로 사용할 수 없다");
		}
	}

}
