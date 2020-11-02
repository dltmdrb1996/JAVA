import java.util.Calendar;
import java.util.Date;

public class CalenderEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		
		
		System.out.println(year);
		System.out.println(month);
	}

}
