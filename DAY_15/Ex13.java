import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		String now2 = sdf.format(now);
		System.out.println(now2);
		
		
		
	}

}
