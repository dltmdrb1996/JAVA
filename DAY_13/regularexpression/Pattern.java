package regularexpression;

public class PatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp= "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
			
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}
		
		regExp="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data="angel@navercom";
		result = Pattern.matches(regExp,data);
	}

}
