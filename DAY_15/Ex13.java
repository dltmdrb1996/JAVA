import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String now2 = sdf.format(now);
		System.out.println(now2);
		
		
		
	}

}
